package com.coderx.calcyou;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    LinearLayout themes_Menu , history_layout ;
    ListView history_list ;
    boolean sumation, subtract, divtion, multiply, modules;
    double number1, number2;
    private  Button pink ,green , dark ,blue , velvet ;
    private Button sum, sub, mul, div, equal, cancel, point, del, mod, themes_btn, history , clear_history ;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, zero;
    private EditText txt;
    int i = 0 ,y = 0 ;

    ArrayList <String> his_list ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.main_layout);
        themes_Menu = findViewById(R.id.vertical_dropdown_icon_menu_items);
        history_layout = findViewById(R.id.history_layout);
        history_list = findViewById(R.id.history_list) ;
        themes_btn = findViewById(R.id.themes_btn);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        cancel = findViewById(R.id.Cancel);
        num8 = findViewById(R.id.num8);
        zero = findViewById(R.id.Zero);
        point = findViewById(R.id.point);
        txt = findViewById(R.id.num_txt1);
        num7 = findViewById(R.id.num7);
        num6 = findViewById(R.id.num6);
        num5 = findViewById(R.id.num5);
        div = findViewById(R.id.div);
        equal = findViewById(R.id.equal);
        num9 = findViewById(R.id.num9);
        num4 = findViewById(R.id.num4);
        num3 = findViewById(R.id.num3);
        sum = findViewById(R.id.sum);
        num2 = findViewById(R.id.num2);
        num1 = findViewById(R.id.num1);
        del = findViewById(R.id.del);
        mod = findViewById(R.id.mod);
        history = findViewById(R.id.hisrory_btn) ;
        clear_history = findViewById(R.id.clear_history);

        // set themes button
        pink = findViewById(R.id.pink_btn);
        green = findViewById(R.id.green_btn);
        dark = findViewById(R.id.dark_btn);
        blue = findViewById(R.id.blue_btn);
        velvet = findViewById(R.id.velvet_btn);

        // make Array list for set themes to all Buttons
        List<Button> btns_list = new ArrayList<>(Arrays.asList(sum, sub, div, mul, cancel, del, mod, zero, point, num1, num2, num3, num4, num5, num6, num7, num8, num9));
        ArrayList<Button> list = new ArrayList<Button>(btns_list);

        // make Array Adaptor for ListView
        his_list = new ArrayList<>();
        his_list.add("saterday");
        his_list.add("sunday");
        his_list.add("monday");
        his_list.add("tusday");
        his_list.add("wednesday");
        his_list.add("thursday");
        his_list.add("friday");

        ArrayAdapter <String> history_adapter = new ArrayAdapter<String>(MainActivity.this , R.layout.history_layout , his_list) ;
        history_list.setAdapter(history_adapter);

        clear_history.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               history_adapter.clear();
                history_layout.setVisibility(View.GONE);


            }
        });

        // themes Button Methods
        pink.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.pink_frame);
                txt.setTextColor(txt.getContext().getColor(R.color.black));
                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.pink_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.pink_frame);
                for (Button btns : list){ btns.setTextColor(btns.getContext().getColor(R.color.black));}
                for (Button btns : list){btns.setBackgroundResource(R.drawable.pink_theme);}
                themes_Menu.setVisibility(View.GONE);

            }
        });
        green.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.green_frame);
                txt.setTextColor(txt.getContext().getColor(R.color.black));
                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.green_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.green_frame);
                for (Button btns : list){btns.setTextColor(btns.getContext().getColor(R.color.black));}
                for (Button btns : list){btns.setBackgroundResource(R.drawable.green_theme);}
                themes_Menu.setVisibility(View.GONE);
            }
        });
        dark.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.dark_frame2);
                txt.setTextColor(equal.getContext().getColor(R.color.white));
                txt.setHintTextColor(txt.getContext().getColor(R.color.white));
                equal.setBackgroundResource(R.drawable.dark_frame2);
                equal.setTextColor(equal.getContext().getColor(R.color.white));
                constraintLayout.setBackgroundResource(R.drawable.dark_frame);
                for (Button btns : list){btns.setTextColor(equal.getContext().getColor(R.color.white));}
                for (Button btns : list){btns.setBackgroundResource(R.drawable.dark_theme);}
                themes_Menu.setVisibility(View.GONE);
            }
        });
        blue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.blue_frame);
                txt.setTextColor(txt.getContext().getColor(R.color.black));
                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.blue_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.blue_frame);
                for (Button btns : list){btns.setTextColor(btns.getContext().getColor(R.color.black));}
                for (Button btns : list){btns.setBackgroundResource(R.drawable.blue_theme);}
                themes_Menu.setVisibility(View.GONE);
            }
        });
        velvet.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.velvet_frame);
                txt.setTextColor(txt.getContext().getColor(R.color.black));
                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.velvet_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.velvet_frame);
                for (Button btns : list){btns.setTextColor(btns.getContext().getColor(R.color.black));}
                for (Button btns : list) {btns.setBackgroundResource(R.drawable.velvet_theme);}
                themes_Menu.setVisibility(View.GONE);
            }
        });

        themes_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                i++ ;
                if (i == 1){
                    themes_Menu.setVisibility(View.VISIBLE);
                } else if (i == 2) {
                    themes_Menu.setVisibility(View.GONE);
                    i = 0 ;
                }
            }

        });

        history.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                y++ ;
                if (y == 1){
                    history_layout.setVisibility(View.VISIBLE);
                } else if (y == 2) {
                    history_layout.setVisibility(View.GONE);
                    y = 0 ;
                }


            }
        });
        num1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "1");
            }
        });

        num2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "2");
            }
        });

        num3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "3");
            }
        });

        num4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "4");
            }
        });

        num5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "5");
            }
        });

        num6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "6");
            }
        });

        num7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "7");
            }
        });

        num8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "8");
            }
        });

        num9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "9");
            }
        });

        point.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + ".");
            }
        });

        zero.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText(txt.getText() + "0");
            }
        });

        sum.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    number1 = Double.parseDouble(txt.getText().toString());
                    sumation = true;
                } catch (NumberFormatException e) {
                }
            }
        });

        sub.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    number1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                    subtract = true;
                } catch (NumberFormatException e) {
                }
            }
        });

        mul.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    number1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                    multiply = true;
                } catch (NumberFormatException e) {
                }
            }
        });

        div.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    number1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                    divtion = true;
                } catch (NumberFormatException e) {
                }
            }
        });

        mod.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    number1 = Double.parseDouble(txt.getText().toString());
                    modules = true;
                } catch (Exception e) {
                }
            }
        });

        equal.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    number2 = Double.parseDouble(txt.getText().toString());
                    if (sumation) {
                        txt.setText(number1 + number2 + "");
                        sumation = false;
                    } else {
                        if (subtract) {
                            txt.setText(number1 - number2 + "");
                            subtract = false;

                        } else if (multiply) {
                            txt.setText(number1 * number2 + "");
                            multiply = false;
                        } else if (divtion) {
                            txt.setText(number1 / number2 + "");
                            divtion = false;
                        } else if (modules) {
                            txt.setText(number1 % number2 + "");
                            modules = false;
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }

        });

        cancel.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                txt.setText("");
                number1 = 0;
                number2 = 0;
            }
        });
        del.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = txt.getText().toString();

                if (!TextUtils.isEmpty(str)) {
                    String Text = str.substring(0, str.length() - 1);
                    txt.setText(Text);
                    txt.setSelection(Text.length());
                }
            }
        });


    }
}
