package com.coderx.calcyou;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    boolean sumation, subtract, divtion, multiply, modules;
    double number1, number2;
    private Button sum, sub, mul, div, equal, cancel, point, del, mod;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, zero;
    private Button blue, dark, green, pink, velvet;
    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.main_layout);
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

        // colors Declarations
        blue = findViewById(R.id.blue_btn);
        dark = findViewById(R.id.dark_theme);
        green = findViewById(R.id.green_theme);
        pink = findViewById(R.id.pink_theme);
        velvet = findViewById(R.id.velvet_theme);


        // make Array list for set themes to all Buttons
        ArrayList<Button> list = new ArrayList<Button>();
        List<Button> btnslist = new ArrayList<>(Arrays.asList(sum, sub, div, mul, cancel, del, mod, zero, point, num1, num2, num3, num4, num5, num6, num7, num8, num9));
        list.addAll(btnslist);

        // colors Buttons Methods

        blue.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.blue_frame);
                txt.setTextColor(Color.parseColor("#000000"));
                equal.setBackgroundResource(R.drawable.blue_frame);
                equal.setTextColor(0xff000000);
                constraintLayout.setBackgroundResource(R.drawable.blue_frame);
                for (Button btns : list) btns.setTextColor(0xff000000);
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.blue_theme);
                }
            }
        });
        dark.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.dark_frame2);
                txt.setTextColor(equal.getContext().getColor(R.color.white));
                equal.setBackgroundResource(R.drawable.dark_frame2);
                equal.setTextColor(equal.getContext().getColor(R.color.white));
                constraintLayout.setBackgroundResource(R.drawable.dark_frame);
                for (Button btns : list)
                    btns.setTextColor(equal.getContext().getColor(R.color.white));
                for (Button btns : list) btns.setBackgroundResource(R.drawable.dark_theme);
            }
        });
        green.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.green_frame);
                txt.setTextColor(Color.parseColor("#000000"));
                equal.setBackgroundResource(R.drawable.green_frame);
                equal.setTextColor(getResources().getColor(R.color.Black));
                constraintLayout.setBackgroundResource(R.drawable.green_frame);
                for (Button btns : list) {
                    btns.setTextColor(getResources().getColor(R.color.Black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.green_theme);
                }
            }
        });
        pink.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.pink_frame);
                txt.setTextColor(Color.parseColor("#000000"));
                equal.setBackgroundResource(R.drawable.pink_frame);
                equal.setTextColor(getResources().getColor(R.color.Black));
                constraintLayout.setBackgroundResource(R.drawable.pink_frame);
                for (Button btns : list) {
                    btns.setTextColor(getResources().getColor(R.color.Black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.pink_theme);
                }
            }
        });
        velvet.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundResource(R.drawable.velvet_frame);
                txt.setTextColor(Color.parseColor("#000000"));
                equal.setBackgroundResource(R.drawable.velvet_frame);
                equal.setTextColor(getResources().getColor(R.color.Black));
                constraintLayout.setBackgroundResource(R.drawable.velvet_frame);
                for (Button btns : list) {
                    btns.setTextColor(getResources().getColor(R.color.Black));
                }
                for (Button btns : list) {
                    btns.setBackgroundResource(R.drawable.velvet_theme);
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
                    txt.setText("");
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
                    txt.setText("");
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
                    } else if (subtract) {
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
