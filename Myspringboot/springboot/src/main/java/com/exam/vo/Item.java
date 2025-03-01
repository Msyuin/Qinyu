package com.exam.vo;

import lombok.Data;

//题目模型
@Data
public class Item {

    private String subject;

    private Integer paperId;

    private Integer changeNumber;

    private Integer fillNumber;

    private Integer judgeNumber;

    public Item(String subject, Integer paperId, Integer changeNumber, Integer fillNumber, Integer judgeNumber) {
        this.subject = subject;
        this.paperId = paperId;
        this.changeNumber = changeNumber;
        this.fillNumber = fillNumber;
        this.judgeNumber = judgeNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getChangeNumber() {
        return changeNumber;
    }

    public void setChangeNumber(Integer changeNumber) {
        this.changeNumber = changeNumber;
    }

    public Integer getFillNumber() {
        return fillNumber;
    }

    public void setFillNumber(Integer fillNumber) {
        this.fillNumber = fillNumber;
    }

    public Integer getJudgeNumber() {
        return judgeNumber;
    }

    public void setJudgeNumber(Integer judgeNumber) {
        this.judgeNumber = judgeNumber;
    }
}
