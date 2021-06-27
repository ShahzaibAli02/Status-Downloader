package com.cd.statussaver.asciiFaces;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cd.statussaver.R;


public class HappyFragment extends Fragment {
    private String[] happyAscii = new String[]{"¯\\_(ツ)_/¯", "(☞ﾟヮﾟ)☞", "(◕‿◕)", "(｡◕‿◕｡)", "( ಠ ͜ʖರೃ)", "(⊙﹏⊙)", "(◠﹏◠)", "(ﾉ◕ヮ◕)ﾉ", "( ͡° ͜ʖ ͡°)", "( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)", "┬┴┬┴┤ ͜ʖ ͡°) ├┬┴┬┴", "(◕‿◕✿)", "ᕕ(✿◕‿◕)ᕗ", "ᕕ(  ◕‿◕)ᕗ", "(ᵔᴥᵔ)", "(づ￣ ³￣)づ", "\\ (•◡•) /", "\\(◕◡◕)/", "(☞ﾟヮﾟ)☞ ☜(ﾟヮﾟ☜)", "☜(ﾟヮﾟ☜)", "♪~ ᕕ(ᐛ)ᕗ", "༼ʘ̚ل͜ʘ̚༽", "ʘ‿ʘ", "~ (˘▾˘~)", "(~˘▾˘)~", "(͡o‿O͡)", "(❍ᴥ❍ʋ)", "| (• ◡•)| (❍ᴥ❍ʋ)", "─=≡Σᕕ( ͡° ͜ʖ ͡°)ᕗ", "( ͡° ͜ʖ ͡°)>⌐■-■", "( ͡ᶢ ͜ʖ ͡ᶢ)", "( ͡^ ͜ʖ ͡^)", "( ͡ᵔ ͜ʖ ͡ᵔ )", "( ͡° ͜ ͡°)", "(˵ ͡° ͜ʖ ͡°˵)", "(∩ ͡° ͜ʖ ͡°)⊃━☆ﾟ", "ᕦ( ͡° ͜ʖ ͡°)ᕤ", "（╯ ͡° ▽ ͡°）╯︵ ┻━┻", "( ͡°╭͜ʖ╮͡° )", "༼ つ  ͡° ͜ʖ ͡° ༽つ", "(｡◕‿‿◕｡)", "(ง°ل͜°)ง", "ಠ⌣ಠ", "♡‿♡", "(●´ω｀●)", "(╹◡╹)", "ლ(╹◡╹ლ)", "(づ｡◕‿‿◕｡)づ", "┏(＾0＾)┛┗(＾0＾) ┓"
                        ,"(≖︿≖ )", "(ง ͠° ͟ل͜ ͡°)ง", "ಠ_ಠ", "( ͠°Д°͠ )", "ლ(ಠ益ಠლ)", "(>ლ)", "(ง'-̀'́)ง", "(ノಠ益ಠ)ノ彡┻━┻", "(╯°□°）╯︵( .o.)", "(╯°□°）╯︵ /( ‿⌓‿ )\\", "(╯°□°）╯︵ ┻━┻", "┻━┻ ︵ヽ(`Д´)ﾉ︵ ┻━┻", "(┛◉Д◉)┛彡┻━┻ ", "(¬_¬)", "ಠoಠ", "ᕙ(⇀‸↼‶)ᕗ", "ᕦ(ò_óˇ)ᕤ", "¯\\_(ʘ_ʘ)_/¯", "( ͡°_ʖ ͡°)", "( ° ͜ʖ͡°)╭∩╮", "( ͡°Ĺ̯ ͡° )", "( ͠° ͟ʖ °͠ )", "¯\\_( ͠° ͟ʖ °͠ )_/¯", "( ͡°⊖ ͡°)", "ರ_ರ", "(>人<)", "ಠ╭╮ಠ", "(◣_◢)", "(⋋▂⋌)", "〴⋋_⋌〵", "(╹◡╹)凸", "ლ(͠°◞౪◟°͠ლ)", "╭∩╮(︶︿︶)╭∩╮", "(ㆆ_ㆆ)",
            "( ཀ ʖ̯ ཀ)", "(╥﹏╥)", "( ͡°ᴥ ͡° ʋ)", "ಠ_ಥ", "ಠ~ಠ", "ʕ◉.◉ʔ", "༼ つ ◕_◕ ༽つ", "(ಥ﹏ಥ)", "ヾ(⌐■_■)ノ", "( ︶︿︶)", "(✖╭╮✖)", "༼ つ ಥ_ಥ ༽つ", "(\"º _ º)", "┬─┬ノ( º _ ºノ)", "(._.) ( l: ) ( .-. ) ( :l ) (._.)", "༼ ºل͟º ༼ ºل͟º ༼ ºل͟º ༽ ºل͟º ༽ ºل͟º ༽", "┬┴┬┴┤(･_├┬┴┬┴", "(°ロ°)☝", "(▀̿Ĺ̯▀̿ ̿)", "﴾͡๏̯͡๏﴿ O'RLY?", "⚆ _ ⚆", "ಠ‿↼", "☼.☼", "◉_◉", "( ✧≖ ͜ʖ≖)", "( ͠° ͟ʖ ͡°)", "( ‾ ʖ̫ ‾)", "(͡ ͡° ͜ つ ͡͡°)", "( ﾟдﾟ)", "┬──┬ ノ( ゜-゜ノ)", "¯\\(°_o)/¯", "(ʘᗩʘ')", "☜(⌒▽⌒)☞", "(;´༎ຶД༎ຶ`)", "̿̿ ̿̿ ̿̿ ̿'̿'\\̵͇̿̿\\з= ( ▀ ͜͞ʖ▀) =ε/̵͇̿̿/’̿’̿ ̿ ̿̿ ̿̿ ̿̿", "[̲̅$̲̅(̲̅5̲̅)̲̅$̲̅]", "(ᇂﮌᇂ)", "(≧ω≦)", "►_◄", "أ ̯ أ", "ლ(╹ε╹ლ)", "ᇂ_ᇂ", "＼(￣ー＼)(／ー￣)／", "♪┏ ( ･o･) ┛♪┗ (･o･ ) ┓♪┏(･o･)┛♪", "╘[◉﹃◉]╕", "( ･_･)♡", "(¤﹏¤)", "( ˘︹˘ )"};

    public void onCreate(Bundle saveInstantceState) {
        super.onCreate(saveInstantceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.happy_fragment, container, false);
        RecyclerView list = view.findViewById(R.id.list);
        list.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        list.setHasFixedSize(true);
        HappyRecycerAdaptersGallery adapter = new HappyRecycerAdaptersGallery(getActivity(), this.happyAscii);
        list.setAdapter(adapter);
        return view;
    }
}
