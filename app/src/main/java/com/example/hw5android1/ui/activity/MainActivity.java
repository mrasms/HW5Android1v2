package com.example.hw5android1.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.hw5android1.R;
import com.example.hw5android1.ui.data.QuestionsClient;
import com.example.hw5android1.ui.data.QuestionsModel;
import com.example.hw5android1.ui.fragment.adapter.QuestionsAdapter;
import com.example.hw5android1.databinding.ActivityMainBinding;
import com.example.hw5android1.ui.interfaces.ItemOnClickListener;
import com.example.hw5android1.ui.fragment.MainFragment;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    QuestionsAdapter questionsAdapter;
    ArrayList<QuestionsModel> questionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialisation();
        listeners();
    }


    private void initialisation() {
        questionList = (ArrayList<QuestionsModel>) QuestionsClient.getListOfQuestions();
        questionsAdapter = new QuestionsAdapter(questionList);
        binding.recyclerView.setAdapter(questionsAdapter);

    }

    private void listeners() {
        questionsAdapter.setItemOnClickListener(new ItemOnClickListener() {
            @Override
            public void onItemClick(QuestionsModel questionModel) {
                MainFragment firstFragment = new MainFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("key", questionModel);
                firstFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, firstFragment).commit();

            }
        });
    }
}