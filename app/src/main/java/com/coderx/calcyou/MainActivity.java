package com.coderx.calcyou;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    boolean sumation, subtract, divtion, multiply, modules;
    double number1, number2;
    private Button sum, sub, mul, div, equal, cancel, point, del, mod, color_btn,test ;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, zero;
    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.main_layout);
        color_btn = findViewById(R.id.colorbtn);
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
        test = findViewById(R.id.test) ;
        // make Array list for set themes to all Buttons
        List<Button> btns_list = new ArrayList<>(Arrays.asList(sum, sub, div, mul, cancel, del, mod, zero, point, num1, num2, num3, num4, num5, num6, num7, num8, num9));
        ArrayList<Button> list = new ArrayList<Button>(btns_list);

        // themes Button Methods
        color_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(MainActivity.this, color_btn);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.colors_menu, popup.getMenu());
                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.blue:
                                txt.setBackgroundResource(R.drawable.blue_frame);
                                txt.setTextColor(txt.getContext().getColor(R.color.black));
                                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                                equal.setBackgroundResource(R.drawable.blue_frame);
                                equal.setTextColor(equal.getContext().getColor(R.color.black));
                                constraintLayout.setBackgroundResource(R.drawable.blue_frame);
                                for (Button btns : list){btns.setTextColor(btns.getContext().getColor(R.color.black));}
                                for (Button btns : list){btns.setBackgroundResource(R.drawable.blue_theme);}
                                return true;
                            case (R.id.dark):
                                txt.setBackgroundResource(R.drawable.dark_frame2);
                                txt.setTextColor(equal.getContext().getColor(R.color.white));
                                txt.setHintTextColor(txt.getContext().getColor(R.color.white));
                                equal.setBackgroundResource(R.drawable.dark_frame2);
                                equal.setTextColor(equal.getContext().getColor(R.color.white));
                                constraintLayout.setBackgroundResource(R.drawable.dark_frame);
                                for (Button btns : list){btns.setTextColor(equal.getContext().getColor(R.color.white));}
                                for (Button btns : list){btns.setBackgroundResource(R.drawable.dark_theme);}
                                return true;
                            case (R.id.green):
                                txt.setBackgroundResource(R.drawable.green_frame);
                                txt.setTextColor(txt.getContext().getColor(R.color.black));
                                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                                equal.setBackgroundResource(R.drawable.green_frame);
                                equal.setTextColor(equal.getContext().getColor(R.color.black));
                                constraintLayout.setBackgroundResource(R.drawable.green_frame);
                                for (Button btns : list){btns.setTextColor(btns.getContext().getColor(R.color.black));}
                                for (Button btns : list){btns.setBackgroundResource(R.drawable.green_theme);}
                                return true;
                            case (R.id.pink):
                                txt.setBackgroundResource(R.drawable.pink_frame);
                                txt.setTextColor(txt.getContext().getColor(R.color.black));
                                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                                equal.setBackgroundResource(R.drawable.pink_frame);
                                equal.setTextColor(equal.getContext().getColor(R.color.black));
                                constraintLayout.setBackgroundResource(R.drawable.pink_frame);
                                for (Button btns : list){ btns.setTextColor(btns.getContext().getColor(R.color.black));}
                                for (Button btns : list){btns.setBackgroundResource(R.drawable.pink_theme);}
                                return true;
                            case (R.id.velvet):
                                txt.setBackgroundResource(R.drawable.velvet_frame);
                                txt.setTextColor(txt.getContext().getColor(R.color.black));
                                txt.setHintTextColor(txt.getContext().getColor(R.color.black));
                                equal.setBackgroundResource(R.drawable.velvet_frame);
                                equal.setTextColor(equal.getContext().getColor(R.color.black));
                                constraintLayout.setBackgroundResource(R.drawable.velvet_frame);
                                for (Button btns : list){btns.setTextColor(btns.getContext().getColor(R.color.black));}
                                for (Button btns : list) {btns.setBackgroundResource(R.drawable.velvet_theme);}
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                popup.show();
            }
        });

        test.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupWindow popwin = new PopupWindow(MainActivity.this) ;
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
