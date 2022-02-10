package com.example.hw5android1.ui.data;

import java.util.ArrayList;
import java.util.List;

public class QuestionsClient {
    public static ArrayList<QuestionsModel> questionList = new ArrayList<>();

public static List <QuestionsModel> getListOfQuestions(){

    questionList.add(new QuestionsModel("Первый вопрос", "Сколько пальцев у человека на руке?", "5", "2", "10", "4", "6", "5"));
    questionList.add(new QuestionsModel("Второй вопрос", "Сколько пальцев у человека на ногах", "5", "2", "42", "7", "10", "10"));
    questionList.add(new QuestionsModel("Третий вопрос", "Почём рыба?", "Бесплатно отдают", "Дорого", "Дёшево", "Сто-пятьсот миллионов тысяч долларов", "Не знаю", "Не знаю"));
    questionList.add(new QuestionsModel("Четвёртый вопрос", "Что из этого коньяк?", "Алтынай", "Кара-Балта", "Каинда", "Сосновка", "Бишкек", "Бишкек"));
    questionList.add(new QuestionsModel("Пятый вопрос", "Как зовут учителя", "Эржан", "Нурсултан", "Алтынбек", "Бакыт", "Кудайберген", "Алтынбек"));
    questionList.add(new QuestionsModel("Шестой вопрос", "Сколько времени я делал домашку?", "1 день", "2 дня", "5 минут", "не важно", "2 часа", "не важно"));

    return questionList;
}
}
