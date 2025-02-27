package org.hibernateOneToManyMapping.entity;


import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private int ans_id;

    @Column(name = "answer")
    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Questions question;

    public Answer() {
    }

    public Answer(int ans_id, String answer, Questions question) {
        this.ans_id = ans_id;
        this.answer = answer;
        this.question = question;
    }

    public int getAns_id() {
        return ans_id;
    }

    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "ans_id=" + ans_id +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }
}
