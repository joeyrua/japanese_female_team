package com.example.japanese_idol_female_team;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.TypedArray;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class nogizaka46_member_introduction extends AppCompatActivity implements View.OnClickListener {
    private GridView grid;
    private Button all,first,second,third, forth;
    private ImageView Image_name;
    private TextView member_name, member_data;
    String[] text ={ "秋元 真夏", "樋口 日奈" , "星野 みなみ", "生田 絵梨花" , "松村 沙友理" ,"齋藤飛鳥" , "高山 一実" , "和田 まあや",
                             "伊藤 純奈" , "北野 日奈子", "新内 眞衣" , "鈴木 絢音" , "寺田 蘭世" ,"渡辺 みり愛" , "山崎 怜奈",
                             "岩本 蓮加" , "伊藤 理々杏" , "向井 葉月", "中村 麗乃" , "大園 桃子" , "阪口 珠美" , "佐藤 楓" , "梅澤 美波" , "山下 美月" , "与田 祐希", "久保 史緒里" , "吉田 綾乃クリスティー",
                             "遠藤 さくら" , "林 瑠奈" , "掛橋 沙耶香" , "賀喜 遥香" , "金川 紗耶" , "北川 悠理" , "黒見 明香" , "松尾 美佑" , "佐藤 璃果" , "柴田 柚菜" , "清宮 レイ" , "田村 真佑" , "筒井 あやめ", "早川 聖来" , "矢久保 美緒" , "弓木 奈於"};
    int[] imageId = {R.drawable.akimotomanatsu, R.drawable.higuchihina, R.drawable.hoshinominami, R.drawable.ikutaerika, R.drawable.matsumurasayuri, R.drawable.saitouasuka, R.drawable.takayamakazumi, R.drawable.wadamaaya,
                             R.drawable.itoujunna, R.drawable.kitanohinako, R.drawable.shinuchimai, R.drawable.suzukiayane, R.drawable.teradaranze, R.drawable.watanabemiria, R.drawable.yamazakirena,
                             R.drawable.iwamotorenka, R.drawable.itouriria, R.drawable.mukaihazuki, R.drawable.nakamurareno, R.drawable.oozonomomoko, R.drawable.sakaguchitamami, R.drawable.satoukaede, R.drawable.umezawaminami, R.drawable.yamashitamizuki, R.drawable.yodayuuki, R.drawable.kuboshiori, R.drawable.yoshidaayanochristie,
                             R.drawable.endousakura, R.drawable.hayashiruna, R.drawable.kakehashisayaka, R.drawable.kakiharuka, R.drawable.kanagawasaya, R.drawable.kitagawayuri, R.drawable.kuromiharuka, R.drawable.matsuomiyu, R.drawable.satourika, R.drawable.shibatayuna, R.drawable.seimiyarei, R.drawable.tamuramayu, R.drawable.tsutsuiayame, R.drawable.hayakawaseira, R.drawable.yakubomio, R.drawable.yumikinao};

    String[] text1 = {"秋元 真夏", "樋口 日奈", "星野 みなみ", "生田 絵梨花", "松村 沙友理", "齋藤飛鳥", "高山 一実", "和田 まあや"};
    int[] imageId1 = {R.drawable.akimotomanatsu, R.drawable.higuchihina, R.drawable.hoshinominami, R.drawable.ikutaerika, R.drawable.matsumurasayuri, R.drawable.saitouasuka, R.drawable.takayamakazumi, R.drawable.wadamaaya};
    String[] text2 = {"伊藤 純奈" , "北野 日奈子", "新内 眞衣" , "鈴木 絢音" , "寺田 蘭世" , "渡辺 みり愛" , "山崎 怜奈"};
    private int[] imageId2 = {R.drawable.itoujunna, R.drawable.kitanohinako, R.drawable.shinuchimai, R.drawable.suzukiayane, R.drawable.teradaranze, R.drawable.watanabemiria, R.drawable.yamazakirena};

    String[] text3 = {"岩本 蓮加" , "伊藤 理々杏" , "向井 葉月", "中村 麗乃" , "大園 桃子" , "阪口 珠美" , "佐藤 楓" , "梅澤 美波" , "山下 美月" , "与田 祐希", "久保 史緒里" , "吉田 綾乃クリスティー" };
    int[] imageId3 = { R.drawable.iwamotorenka, R.drawable.itouriria, R.drawable.mukaihazuki, R.drawable.nakamurareno, R.drawable.oozonomomoko, R.drawable.sakaguchitamami, R.drawable.satoukaede, R.drawable.umezawaminami, R.drawable.yamashitamizuki, R.drawable.yodayuuki, R.drawable.kuboshiori, R.drawable.yoshidaayanochristie};

    String[] text4 = {"遠藤 さくら" , "林 瑠奈" , "掛橋 沙耶香" , "賀喜 遥香" , "金川 紗耶" , "北川 悠理" , "黒見 明香" , "松尾 美佑" , "佐藤 璃果" , "柴田 柚菜" , "清宮 レイ" , "田村 真佑" , "筒井 あやめ", "早川 聖来" , "矢久保 美緒" , "弓木 奈於"};
    private int[] imageId4 = {R.drawable.endousakura, R.drawable.hayashiruna, R.drawable.kakehashisayaka, R.drawable.kakiharuka, R.drawable.kanagawasaya, R.drawable.kitagawayuri, R.drawable.kuromiharuka, R.drawable.matsuomiyu, R.drawable.satourika, R.drawable.shibatayuna, R.drawable.seimiyarei, R.drawable.tamuramayu, R.drawable.tsutsuiayame, R.drawable.hayakawaseira, R.drawable.yakubomio, R.drawable.yumikinao};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nogizaka46_member_introduction);
        grid = findViewById(R.id.grid);
        all = findViewById(R.id.button);
        first = findViewById(R.id.button2);
        second = findViewById(R.id.button3);
        third = findViewById(R.id.button4);
        forth = findViewById(R.id.button5);
        all.setOnClickListener(this);
        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        forth.setOnClickListener(this);

    }
    public void show() {
        final Dialog dialog = new Dialog(nogizaka46_member_introduction.this);
        dialog.setContentView(R.layout.nogizaka46_choose_member);
        Image_name = dialog.findViewById(R.id.imageView_show);
        member_name = dialog.findViewById(R.id.name_show);
        member_data = dialog.findViewById(R.id.explanation);
        Button btn_close = dialog.findViewById(R.id.close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
        dialog.setCancelable(false);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                MainAdapter adapter = new MainAdapter(nogizaka46_member_introduction.this, text, imageId);
                grid.setAdapter(adapter);
                grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        show();
                        member_name.setText(text[position]);
                        Image_name.setImageResource(imageId[position]);
                        switch (position) {
                            //一期生
                            case 0:
                                member_data.setText("團隊:\t一期生\n出生日:\t1993年8月20日\n血型:\tB型\n星座:\t獅子座\n身高:\t154cm");
                                break;
                            case 1:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年1月31日\n血型:\tB型\n星座:\t水瓶座\n身高:\t161cm");
                                break;
                            case 2:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年2月6日\n血型:\tB型\n星座:\t水瓶座\n身高:\t155cm");
                                break;
                            case 3:
                                member_data.setText("團隊:\t一期生\n出生日:\t1997年1月22日\n血型:\tA型\n星座:\t水瓶座\n身高:\t160cm");
                                break;
                            case 4:
                                member_data.setText("團隊:\t一期生\n出生日:\t1992年8月27日\n血型:\tB型\n星座:\t處女座\n身高:\t164cm");
                                break;
                            case 5:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年8月10日\n血型:\tO型\n星座:\t獅子座\n身高:\t158cm");
                                break;
                            case 6:
                                member_data.setText("團隊:\t一期生\n出生日:\t1994年2月8日\n血型:\tA型\n星座:\t水瓶座\n身高:\t162cm");
                                break;
                            case 7:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年4月23日\n血型:\tO型\n星座:\t金牛座\n身高:\t161cm");
                                break;

                              //二期生
                            case 8:
                                member_data.setText("團隊:\t二期生\n出生日:\t1998年11月30日\n血型:\tA型\n星座:\t射手座\n身高:\t166cm");
                                break;
                            case 9:
                                member_data.setText("團隊:\t二期生\n出生日:\t1996年7月17日\n血型:\tO型\n星座:\t巨蟹座\n身高:\t158cm");
                                break;
                            case 10:
                                member_data.setText("團隊:\t二期生\n出生日:\t1992年1月22日\n血型:\tB型\n星座:\t水瓶座\n身高:\t165cm");
                                break;
                            case 11:
                                member_data.setText("團隊:\t二期生\n出生日:\t1999年3月5日\n血型:\tO型\n星座:\t雙魚座\n身高:\t161cm");
                                break;
                            case 12:
                                member_data.setText("團隊:\t二期生\n出生日:\t1998年9月23日\n血型:\t---型\n星座:\t天秤座\n身高:\t155cm");
                                break;
                            case 13:
                                member_data.setText("團隊:\t二期生\n出生日:\t1999年11月1日\n血型:\tO型\n星座:\t巨蠍座\n身高:\t153cm");
                                break;
                            case 14:
                                member_data.setText("團隊:\t二期生\n出生日:\t1997年5月21日\n血型:\tB型\n星座:\t雙子座\n身高:\t164cm");
                                break;

                                //三期生
                            case 15:
                                member_data.setText("團隊:\t三期生\n出生日:\t2004年2月2日\n血型:\tB型\n星座:\t水秤座\n身高:\t159cm");
                                break;
                            case 16:
                                member_data.setText("團隊:\t三期生\n出生日:\t2002年10月8日\n血型:\tB型\n星座:\t天秤座\n身高:\t154cm");
                                break;
                            case 17:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年8月23日\n血型:\tA型\n星座:\t處女座\n身高:\t152cm");
                                break;
                            case 18:
                                member_data.setText("團隊:\t三期生\n出生日:\t2001年9月27日\n血型:\t---型\n星座:\t天秤座\n身高:\t167cm");
                                break;
                            case 19:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年9月13日\n血型:\tO型\n星座:\t處女座\n身高:\t156cm");
                                break;
                            case 20:
                                member_data.setText("團隊:\t三期生\n出生日:\t2001年11月10日\n血型:\tA型\n星座:\t天蠍座\n身高:\t161cm");
                                break;
                            case 21:
                                member_data.setText("團隊:\t三期生\n出生日:\t1998年3月23日\n血型:\tA型\n星座:\t白羊座\n身高:\t161cm");
                                break;
                            case 22:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年1月6日\n血型:\tA型\n星座:\t摩羯座\n身高:\t170cm");
                                break;
                            case 23:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年7月26日\n血型:\tO型\n星座:\t獅子座\n身高:\t160cm");
                                break;
                            case 24:
                                member_data.setText("團隊:\t三期生\n出生日:\t2000年5月5日\n血型:\tO型\n星座:\t金牛座\n身高:\t153cm");
                                break;
                            case 25:
                                member_data.setText("團隊:\t三期生\n出生日:\t2001年7月14日\n血型:\tO型\n星座:\t巨蟹座\n身高:\t161cm");
                                break;
                            case 26:
                                member_data.setText("團隊:\t三期生\n出生日:\t1995年9月6日\n血型:\tA型\n星座:\t處女座\n身高:\t161cm");
                                break;

                                //四期生
                            case 27:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年10月3日\n血型:\t---型\n星座:\t天秤座\n身高:\t164cm");
                                break;
                            case 28:
                                member_data.setText("團隊:\t四期生\n出生日:\t2003年10月2日\n血型:\tO型\n星座:\t天秤座\n身高:\t164cm");
                                break;
                            case 29:
                                member_data.setText("團隊:\t四期生\n出生日:\t2002年11月20日\n血型:\tB型\n星座:\t天蠍座\n身高:\t154cm");
                                break;
                            case 30:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年8月8日\n血型:\tA型\n星座:\t獅子座\n身高:\t166cm");
                                break;
                            case 31:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年10月31日\n血型:\tO型\n星座:\t天蠍座\n身高:\t165cm");
                                break;
                            case 32:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年8月8日\n血型:\t---型\n星座:\t獅子座\n身高:\t165cm");
                                break;
                            case 33:
                                member_data.setText("團隊:\t四期生\n出生日:\t2004年1月19日\n血型:\tO型\n星座:\t摩羯座\n身高:\t162cm");
                                break;
                            case 34:
                                member_data.setText("團隊:\t四期生\n出生日:\t2004年1月3日\n血型:\tO型\n星座:\t摩羯座\n身高:\t167cm");
                                break;
                            case 35:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年8月9日\n血型:\tB型\n星座:\t獅子座\n身高:\t160cm");
                                break;
                            case 36:
                                member_data.setText("團隊:\t四期生\n出生日:\t2003年3月3日\n血型:\tA型\n星座:\t雙魚座\n身高:\t160cm");
                                break;
                            case 37:
                                member_data.setText("團隊:\t四期生\n出生日:\t2003年8月1日\n血型:\tO型\n星座:\t獅子座\n身高:\t164cm");
                                break;
                            case 38:
                                member_data.setText("團隊:\t四期生\n出生日:\t1999年1月12日\n血型:\tA型\n星座:\t摩羯座\n身高:\t160cm");
                                break;
                            case 39:
                                member_data.setText("團隊:\t四期生\n出生日:\t2004年6月8日\n血型:\tO型\n星座:\t雙子座\n身高:\t160cm");
                                break;
                            case 40:
                                member_data.setText("團隊:\t四期生\n出生日:\t2000年8月4日\n血型:\tA型\n星座:\t處女座\n身高:\t164cm");
                                break;
                            case 41:
                                member_data.setText("團隊:\t四期生\n出生日:\t2002年8月14日\n血型:\tB型\n星座:\t獅子座\n身高:\t153cm");
                                break;
                            case 42:
                                member_data.setText("團隊:\t四期生\n出生日:\t1999年2月3日\n血型:\tA型\n星座:\t水瓶座\n身高:\t165cm");
                                break;
                            default:
                                break;

                        }
                    }
                });
                break;
            case R.id.button2:
                MainAdapter adapter1 = new MainAdapter(nogizaka46_member_introduction.this, text1, imageId1);
                grid.setAdapter(adapter1);
                grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        show();
                        member_name.setText(text1[position]);
                        Image_name.setImageResource(imageId1[position]);
                        switch (position) {
                            case 0:
                                member_data.setText("團隊:\t一期生\n出生日:\t1993年8月20日\n血型:\tB型\n星座:\t獅子座\n身高:\t154cm");
                                break;
                            case 1:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年1月31日\n血型:\tB型\n星座:\t水瓶座\n身高:\t161cm");
                                break;
                            case 2:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年2月6日\n血型:\tB型\n星座:\t水瓶座\n身高:\t155cm");
                                break;
                            case 3:
                                member_data.setText("團隊:\t一期生\n出生日:\t1997年1月22日\n血型:\tA型\n星座:\t水瓶座\n身高:\t160cm");
                                break;
                            case 4:
                                member_data.setText("團隊:\t一期生\n出生日:\t1992年8月27日\n血型:\tB型\n星座:\t處女座\n身高:\t164cm");
                                break;
                            case 5:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年8月10日\n血型:\tO型\n星座:\t獅子座\n身高:\t158cm");
                                break;
                            case 6:
                                member_data.setText("團隊:\t一期生\n出生日:\t1994年2月8日\n血型:\tA型\n星座:\t水瓶座\n身高:\t162cm");
                                break;
                            case 7:
                                member_data.setText("團隊:\t一期生\n出生日:\t1998年4月23日\n血型:\tO型\n星座:\t金牛座\n身高:\t161cm");
                                break;

                        }
                    }
                });
                break;
            case R.id.button3:
                MainAdapter adapter2 = new MainAdapter(nogizaka46_member_introduction.this, text2, imageId2);
                grid.setAdapter(adapter2);
                grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        show();
                        member_name.setText(text2[position]);
                        Image_name.setImageResource(imageId2[position]);

                        switch (position) {
                            case 0:
                                member_data.setText("團隊:\t二期生\n出生日:\t1998年11月30日\n血型:\tA型\n星座:\t射手座\n身高:\t166cm");
                                break;
                            case 1:
                                member_data.setText("團隊:\t二期生\n出生日:\t1996年7月17日\n血型:\tO型\n星座:\t巨蟹座\n身高:\t158cm");
                                break;
                            case 2:
                                member_data.setText("團隊:\t二期生\n出生日:\t1992年1月22日\n血型:\tB型\n星座:\t水瓶座\n身高:\t165cm");
                                break;
                            case 3:
                                member_data.setText("團隊:\t二期生\n出生日:\t1999年3月5日\n血型:\tO型\n星座:\t雙魚座\n身高:\t161cm");
                                break;
                            case 4:
                                member_data.setText("團隊:\t二期生\n出生日:\t1998年9月23日\n血型:\t---型\n星座:\t天秤座\n身高:\t155cm");
                                break;
                            case 5:
                                member_data.setText("團隊:\t二期生\n出生日:\t1999年11月1日\n血型:\tO型\n星座:\t巨蠍座\n身高:\t153cm");
                                break;
                            case 6:
                                member_data.setText("團隊:\t二期生\n出生日:\t1997年5月21日\n血型:\tB型\n星座:\t雙子座\n身高:\t164m");
                                break;

                        }
                    }
                });
                break;
            case R.id.button4:
                MainAdapter adapter3 = new MainAdapter(nogizaka46_member_introduction.this, text3, imageId3);
                grid.setAdapter(adapter3);
                grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        show();
                        member_name.setText(text3[position]);
                        Image_name.setImageResource(imageId3[position]);
                        switch (position) {
                            case 0:
                                member_data.setText("團隊:\t三期生\n出生日:\t2004年2月2日\n血型:\tB型\n星座:\t水秤座\n身高:\t159cm");
                                break;
                            case 1:
                                member_data.setText("團隊:\t三期生\n出生日:\t2002年10月8日\n血型:\tB型\n星座:\t天秤座\n身高:\t154cm");
                                break;
                            case 2:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年8月23日\n血型:\tA型\n星座:\t處女座\n身高:\t152cm");
                                break;
                            case 3:
                                member_data.setText("團隊:\t三期生\n出生日:\t2001年9月27日\n血型:\t---型\n星座:\t天秤座\n身高:\t167cm");
                                break;
                            case 4:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年9月13日\n血型:\tO型\n星座:\t處女座\n身高:\t156cm");
                                break;
                            case 5:
                                member_data.setText("團隊:\t三期生\n出生日:\t2001年11月10日\n血型:\tA型\n星座:\t天蠍座\n身高:\t161cm");
                                break;
                            case 6:
                                member_data.setText("團隊:\t三期生\n出生日:\t1998年3月23日\n血型:\tA型\n星座:\t白羊座\n身高:\t161cm");
                                break;
                            case 7:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年1月6日\n血型:\tA型\n星座:\t摩羯座\n身高:\t170cm");
                                break;
                            case 8:
                                member_data.setText("團隊:\t三期生\n出生日:\t1999年7月26日\n血型:\tO型\n星座:\t獅子座\n身高:\t160cm");
                                break;
                            case 9:
                                member_data.setText("團隊:\t三期生\n出生日:\t2000年5月5日\n血型:\tO型\n星座:\t金牛座\n身高:\t153cm");
                                break;
                            case 10:
                                member_data.setText("團隊:\t三期生\n出生日:\t2001年7月14日\n血型:\tO型\n星座:\t巨蟹座\n身高:\t161cm");
                                break;
                            case 11:
                                member_data.setText("團隊:\t三期生\n出生日:\t1995年9月6日\n血型:\tA型\n星座:\t處女座\n身高:\t161cm");
                                break;

                        }
                    }
                });
                break;
            case R.id.button5:
                MainAdapter adapter4 = new MainAdapter(nogizaka46_member_introduction.this, text4, imageId4);
                grid.setAdapter(adapter4);
                grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        show();
                        member_name.setText(text4[position]);
                        Image_name.setImageResource(imageId4[position]);
                        switch (position) {
                            case 0:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年10月3日\n血型:\t---型\n星座:\t天秤座\n身高:\t164cm");
                                break;
                            case 1:
                                member_data.setText("團隊:\t四期生\n出生日:\t2003年10月2日\n血型:\tO型\n星座:\t天秤座\n身高:\t164cm");
                                break;
                            case 2:
                                member_data.setText("團隊:\t四期生\n出生日:\t2002年11月20日\n血型:\tB型\n星座:\t天蠍座\n身高:\t154cm");
                                break;
                            case 3:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年8月8日\n血型:\tA型\n星座:\t獅子座\n身高:\t166cm");
                                break;
                            case 4:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年10月31日\n血型:\tO型\n星座:\t天蠍座\n身高:\t165cm");
                                break;
                            case 5:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年8月8日\n血型:\t---型\n星座:\t獅子座\n身高:\t165cm");
                                break;
                            case 6:
                                member_data.setText("團隊:\t四期生\n出生日:\t2004年1月19日\n血型:\tO型\n星座:\t摩羯座\n身高:\t162cm");
                                break;
                            case 7:
                                member_data.setText("團隊:\t四期生\n出生日:\t2004年1月3日\n血型:\tO型\n星座:\t摩羯座\n身高:\t167cm");
                                break;
                            case 8:
                                member_data.setText("團隊:\t四期生\n出生日:\t2001年8月9日\n血型:\tB型\n星座:\t獅子座\n身高:\t160cm");
                                break;
                            case 9:
                                member_data.setText("團隊:\t四期生\n出生日:\t2003年3月3日\n血型:\tA型\n星座:\t雙魚座\n身高:\t160cm");
                                break;
                            case 10:
                                member_data.setText("團隊:\t四期生\n出生日:\t2003年8月1日\n血型:\tO型\n星座:\t獅子座\n身高:\t164cm");
                                break;
                            case 11:
                                member_data.setText("團隊:\t四期生\n出生日:\t1999年1月12日\n血型:\tA型\n星座:\t摩羯座\n身高:\t160cm");
                                break;
                            case 12:
                                member_data.setText("團隊:\t四期生\n出生日:\t2004年6月8日\n血型:\tO型\n星座:\t雙子座\n身高:\t160cm");
                                break;
                            case 13:
                                member_data.setText("團隊:\t四期生\n出生日:\t2000年8月4日\n血型:\tA型\n星座:\t處女座\n身高:\t164cm");
                                break;
                            case 14:
                                member_data.setText("團隊:\t四期生\n出生日:\t2002年8月14日\n血型:\tB型\n星座:\t獅子座\n身高:\t153cm");
                                break;
                            case 15:
                                member_data.setText("團隊:\t四期生\n出生日:\t1999年2月3日\n血型:\tA型\n星座:\t水瓶座\n身高:\t165cm");
                                break;
                        }
                    }
                });
                break;
            default:
                break;
        }
    }
}