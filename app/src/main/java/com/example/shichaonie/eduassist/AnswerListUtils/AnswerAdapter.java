package com.example.shichaonie.eduassist.AnswerListUtils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.shichaonie.eduassist.R;
import com.example.shichaonie.eduassist.UserData.AnswerData;
import com.example.shichaonie.eduassist.UserData.User;

import java.util.ArrayList;

/**
 * Created by Shichao Nie on 2017/1/29.
 */

public class AnswerAdapter extends ArrayAdapter<AnswerData> {

    public AnswerAdapter(Context context, ArrayList<AnswerData> arrayList){
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.question_detail_list_item, parent, false);
        }
        AnswerData answerData = getItem(position);

        TextView answerName = (TextView) listView.findViewById(R.id.question_answer_user_name);
        answerName.setText(answerData != null ? answerData.getmAnswer_name() : "");

        TextView answerSelfIntro = (TextView) listView.findViewById(R.id.question_answer_user_selfIntro);
        answerSelfIntro.setText(answerData != null ? answerData.getmAnswer_selfIntro() : "");

        TextView answerText = (TextView) listView.findViewById(R.id.question_answer_user_answer);
        answerText.setText(answerData != null ? answerData.getmContent_text() : "");

        return listView;
    }
}
