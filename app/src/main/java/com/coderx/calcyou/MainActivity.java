package com.coderx.calcyou;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.mariuszgromada.math.mxparser.*;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    LinearLayout themes_layout, history_layout, calculate_layout;
    ListView history_list;
    int i = 0, y = 0;
    String str = "", result;
    ArrayList<history> history_array;
    myAdapter adapter;
    private boolean left_bracket = true;
    private Button pink, green, dark, blue, red;
    private Button sum, sub, mul, div, equal, clear, point, del, mod, brackets, themes_btn, history, clear_history;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, zero;
    private EditText input_txt, result_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.main_layout);
        themes_layout = findViewById(R.id.vertical_dropdown_icon_menu_items);
        history_layout = findViewById(R.id.history_layout);
        history_list = findViewById(R.id.history_list);
        themes_btn = findViewById(R.id.themes_btn);
        input_txt = findViewById(R.id.input);
        result_txt = findViewById(R.id.result);

        //-------------Numbers---------------
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        zero = findViewById(R.id.Zero);
        //-------------Arithmetics---------------
        sum = findViewById(R.id.sum);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        equal = findViewById(R.id.equal);
        del = findViewById(R.id.del);
        mod = findViewById(R.id.mod);
        clear = findViewById(R.id.Cancel);
        point = findViewById(R.id.point);
        brackets = findViewById(R.id.l_bracket);
        history = findViewById(R.id.hisrory_btn);
        clear_history = findViewById(R.id.clear_history);
        calculate_layout = findViewById(R.id.calc_layout);

        // set themes button
        pink = findViewById(R.id.pink_btn);
        green = findViewById(R.id.green_btn);
        dark = findViewById(R.id.dark_btn);
        blue = findViewById(R.id.blue_btn);
        red = findViewById(R.id.velvet_btn);

        // make Array list for set themes to all Buttons
        List<Button> nums_list = new ArrayList<>(Arrays.asList(clear, del, mod, zero, point, brackets, num1, num2, num3, num4, num5, num6, num7, num8, num9));
        ArrayList<Button> list = new ArrayList<>(nums_list);

        List<Button> exp_list = new ArrayList<>(Arrays.asList(sum, sub, div, mul));
        ArrayList<Button> list2 = new ArrayList<>(exp_list);

        // _______make custom_adaptor for ListView---------
        history_array = new ArrayList<>();
        adapter = new myAdapter(this, R.layout.history_layout, history_array);
        history_list.setAdapter(adapter);


        //---------------------------------------------------

        // themes Button Methods
        pink.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                input_txt.setTextColor(input_txt.getContext().getColor(R.color.black));
                input_txt.setHintTextColor(input_txt.getContext().getColor(R.color.black));
                result_txt.setTextColor(result_txt.getContext().getColor(R.color.black));
                result_txt.setHintTextColor(result_txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.pink_equal_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.pink_frame);
                themes_layout.setBackgroundResource(R.drawable.pink_frame);
                history_layout.setBackgroundResource(R.drawable.pink_frame);
                calculate_layout.setBackgroundResource(R.drawable.pink_frame);
                for (Button btns : list) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.pink_theme);
                }
                for (Button btns : list2) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list2) {
                    btns.setBackgroundResource(R.drawable.pink_theme2);
                }
                themes_layout.setVisibility(View.GONE);

            }
        });
        green.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                input_txt.setTextColor(input_txt.getContext().getColor(R.color.black));
                input_txt.setHintTextColor(input_txt.getContext().getColor(R.color.black));
                result_txt.setTextColor(result_txt.getContext().getColor(R.color.black));
                result_txt.setHintTextColor(result_txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.green_equal_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.green_frame);
                themes_layout.setBackgroundResource(R.drawable.green_frame);
                history_layout.setBackgroundResource(R.drawable.green_frame);
                calculate_layout.setBackgroundResource(R.drawable.green_frame);
                for (Button btns : list) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.green_theme);
                }
                for (Button btns : list2) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list2) {
                    btns.setBackgroundResource(R.drawable.green_theme2);
                }
                themes_layout.setVisibility(View.GONE);
            }
        });
        dark.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                input_txt.setTextColor(input_txt.getContext().getColor(R.color.white));
                input_txt.setHintTextColor(input_txt.getContext().getColor(R.color.white));
                result_txt.setTextColor(result_txt.getContext().getColor(R.color.white));
                result_txt.setHintTextColor(result_txt.getContext().getColor(R.color.white));
                equal.setBackgroundResource(R.drawable.dark_equal_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.white));
                constraintLayout.setBackgroundResource(R.drawable.dark_frame);
                themes_layout.setBackgroundResource(R.drawable.dark_history_frame);
                history_layout.setBackgroundResource(R.drawable.dark_history_frame);
                calculate_layout.setBackgroundResource(R.drawable.dark_frame2);
                for (Button btns : list) {
                    btns.setTextColor(equal.getContext().getColor(R.color.white));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.dark_theme);
                }
                for (Button btns : list2) {
                    btns.setTextColor(btns.getContext().getColor(R.color.white));
                }
                for (Button btns : list2) {
                    btns.setBackgroundResource(R.drawable.dark_theme2);
                }
                themes_layout.setVisibility(View.GONE);
            }
        });
        blue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                input_txt.setTextColor(input_txt.getContext().getColor(R.color.black));
                input_txt.setHintTextColor(input_txt.getContext().getColor(R.color.black));
                result_txt.setTextColor(result_txt.getContext().getColor(R.color.black));
                result_txt.setHintTextColor(result_txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.blue_equal_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.blue_frame);
                themes_layout.setBackgroundResource(R.drawable.blue_frame);
                history_layout.setBackgroundResource(R.drawable.blue_frame);
                calculate_layout.setBackgroundResource(R.drawable.blue_frame);
                for (Button btns : list) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.blue_theme);
                }
                for (Button btns : list2) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list2) {
                    btns.setBackgroundResource(R.drawable.blue_theme2);
                }
                themes_layout.setVisibility(View.GONE);
            }
        });
        red.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                input_txt.setTextColor(input_txt.getContext().getColor(R.color.black));
                input_txt.setHintTextColor(input_txt.getContext().getColor(R.color.black));
                result_txt.setTextColor(result_txt.getContext().getColor(R.color.black));
                result_txt.setHintTextColor(result_txt.getContext().getColor(R.color.black));
                equal.setBackgroundResource(R.drawable.red_equal_frame);
                equal.setTextColor(equal.getContext().getColor(R.color.black));
                constraintLayout.setBackgroundResource(R.drawable.red_frame);
                themes_layout.setBackgroundResource(R.drawable.red_frame);
                history_layout.setBackgroundResource(R.drawable.red_frame);
                calculate_layout.setBackgroundResource(R.drawable.red_frame);
                for (Button btns : list) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.red_theme);
                }
                for (Button btns : list2) {
                    btns.setTextColor(btns.getContext().getColor(R.color.black));
                }
                for (Button btns : list2) {
                    btns.setBackgroundResource(R.drawable.red_theme2);
                }
                themes_layout.setVisibility(View.GONE);
            }
        });

        themes_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i == 1) {
                    themes_layout.setVisibility(View.VISIBLE);
                } else if (i == 2) {
                    themes_layout.setVisibility(View.GONE);
                    i = 0;
                }
            }

        });

        history.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                y++;
                if (y == 1) {
                    history_layout.setVisibility(View.VISIBLE);
                } else if (y == 2) {
                    history_layout.setVisibility(View.GONE);
                    y = 0;
                }


            }
        });

        history_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                input_txt.setText(adapter.getItem(i).getCalculation());
                result_txt.setText(adapter.getItem(i).getResult());
                history_layout.setVisibility(View.GONE);
            }
        });

        clear_history.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.clear();
                adapter.notifyDataSetChanged();
                history_layout.setVisibility(View.GONE);


            }
        });
        num1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("1");
            }
        });

        num2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("2");
            }
        });

        num3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("3");
            }
        });

        num4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("4");
            }
        });

        num5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("5");
            }
        });

        num6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("6");
            }
        });

        num7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("7");
            }
        });

        num8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("8");
            }
        });

        num9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("9");
            }
        });

        point.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue(".");
            }
        });

        zero.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setValue("0");
            }
        });

        sum.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    setValue("+");
                } catch (Exception e) {
                }
            }
        });

        sub.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    setValue("-");
                } catch (Exception e) {
                }
            }
        });

        mul.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    setValue("×");
                } catch (Exception e) {
                }
            }
        });

        div.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    setValue("÷");
                } catch (Exception e) {
                }
            }
        });

        mod.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    setValue("%");
                } catch (Exception e) {
                }
            }
        });

        brackets.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (left_bracket) {
                    setValue("(");
                    left_bracket = false;
                } else {
                    setValue(")");
                    left_bracket = true;
                }
            }
        });


        equal.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                str = input_txt.getText().toString();
                str.replace("×", "*");
                str.replace("%", "/100");
                str.replace("÷", "/");


                Expression exp = new Expression(str);
                result = String.valueOf(exp.calculate());
                formatNum(result);
                result_txt.setText(result);
                result_txt.setSelection(result.length());
                history_array.add(new history(str, result));
                adapter.notifyDataSetChanged();


            }

        });

        clear.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                input_txt.setText("");
                result_txt.setText("");
                left_bracket = true;
            }
        });
        del.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = input_txt.getText().toString();

                if (!TextUtils.isEmpty(str)) {
                    String Text = str.substring(0, str.length() - 1);
                    input_txt.setText(Text);
                    input_txt.setSelection(Text.length());
                }
            }
        });

    }

    public void setValue(String Value) {
        str = input_txt.getText().toString();
        String input_str = str +Value;
        input_txt.setText(input_str);


    }

    public void formatNum(String str) {
        double formatNum = Double.parseDouble(str);
        NumberFormat myformate =NumberFormat.getInstance();
        myformate.setGroupingUsed(true);
        result = myformate.format(formatNum);
    }

}
