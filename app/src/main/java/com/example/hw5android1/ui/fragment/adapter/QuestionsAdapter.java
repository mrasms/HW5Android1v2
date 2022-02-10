package com.example.hw5android1.ui.fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw5android1.databinding.QHolderBinding;
import com.example.hw5android1.ui.data.QuestionsModel;
import com.example.hw5android1.ui.interfaces.ItemOnClickListener;

import java.util.ArrayList;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.HolderQuestion> {
    ArrayList<QuestionsModel> list = new ArrayList<>();
    ItemOnClickListener itemOnClickListener;


    public QuestionsAdapter(ArrayList<QuestionsModel> list) {
        this.list = list;

    }


    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }


    @NonNull
    @Override
    public QuestionsAdapter.HolderQuestion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HolderQuestion(QHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HolderQuestion holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderQuestion extends RecyclerView.ViewHolder {
        QHolderBinding binding;


        public HolderQuestion(@NonNull QHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        public void onBind(QuestionsModel questionModel) {
            binding.tvText.setText(questionModel.getQuestionNum());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemOnClickListener.onItemClick(questionModel);

                }
            });
        }
    }
}
