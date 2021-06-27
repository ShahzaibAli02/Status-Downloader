package com.cd.statussaver.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.cd.statussaver.R;
import com.cd.statussaver.activity.FullViewActivity;
import com.cd.statussaver.activity.GalleryActivity;
import com.cd.statussaver.adapter.FileListAdapter;
import com.cd.statussaver.databinding.FragmentHistoryBinding;
import com.cd.statussaver.interfaces.FileListClickInterface;
import org.jetbrains.annotations.NotNull;
import java.io.File;
import java.util.ArrayList;
import static androidx.databinding.DataBindingUtil.inflate;
import static com.cd.statussaver.util.Utils.RootDirectoryTikTokShow;

public class TikTokDownloadedFragment extends Fragment implements FileListClickInterface {
    private FragmentHistoryBinding binding;
    private FileListAdapter fileListAdapter;
    private ArrayList<File> fileArrayList;

    public static TikTokDownloadedFragment newInstance(String param1) {
        TikTokDownloadedFragment fragment = new TikTokDownloadedFragment();
        Bundle args = new Bundle();
        args.putString("m", param1);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onAttach(@NotNull Context _context) {
        super.onAttach(_context);

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String mParam1 = getArguments().getString("m");
        }
    }
    @Override
    public void onResume() {
        super.onResume();

        getAllFiles();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = inflate(inflater, R.layout.fragment_history, container, false);
        initViews();
        return binding.getRoot();
    }
    private void initViews(){
        binding.swiperefresh.setOnRefreshListener(() -> {
            getAllFiles();
            binding.swiperefresh.setRefreshing(false);
        });
    }

    private void getAllFiles(){
        fileArrayList = new ArrayList<>();
        File[] files = RootDirectoryTikTokShow.listFiles();
        if (files!=null) {
            for (File file : files) {
                fileArrayList.add(file);
            }

            fileListAdapter = new FileListAdapter(getActivity(), fileArrayList, TikTokDownloadedFragment.this);
            binding.rvFileList.setAdapter(fileListAdapter);
        }

    }

    @Override
    public void getPosition(int position, File file) {
        Intent inNext = new Intent(getActivity(), FullViewActivity.class);
        inNext.putExtra("ImageDataFile", fileArrayList);
        inNext.putExtra("Position", position);
        getActivity().startActivity(inNext);
    }
}
