package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class History {
    private List<Result> resultList;

    public History(){
        resultList = new ArrayList<Result>();
    }
    public History(Result result){
        resultList = new ArrayList<Result>();
        resultList.add(result);
    }

    public void addResult(Result result){
        resultList.add(result);
    }
    public void removeResult (int index){
        if (index < 0 || index >= resultList.size())
            return;
        resultList.remove(index);
    }
    public void viewHistory (){
        for (int i = 0;i < resultList.size();i++)
            System.out.println(resultList.get(i).getDetails());
    }
    public void viewStatistics(){
        // Code
    }
}
