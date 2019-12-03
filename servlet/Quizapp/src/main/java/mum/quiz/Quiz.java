/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mum.quiz;

/**
 *
 * @author 610594
 */
public class Quiz {
public int qnumber;
public int score;

public Quiz (){
    score = 0;
    qnumber=0;
}
public int getQnumber(){

return qnumber;

}
public int getScore(){

return score;

}



public void setScore(int score){
this.score = score;
}
public void setQnumber(int qnumber){
this.score = qnumber;
}


public void ourLogic(int answer){

if(this.qnumber==5){


} 

else{
 if(answer==QuizDb.answers[qnumber])
{
    ++this.score;
    ++this.qnumber;
}
else{
    ++this.qnumber;
}
}

}




}
