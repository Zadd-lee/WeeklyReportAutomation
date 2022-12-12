package comm.mention;

import comm.DateOfToday;

import java.time.LocalDate;

public class Mention extends DateOfToday {

    private String issueDate;
    private String docDate;
    private String docNameDate;
    private String mentForSend;

    private StringBuffer buffer;

    public Mention(LocalDate date) {
        super(date);
        setIssueDate();
        setDocDate();
        setDocNameDate();
        setMentForSend();

    }

    private void setIssueDate() {

        int issueDateMonth = month;
        int issueDateDay = day + 3;

        String issueDateMonthString = setDateString(issueDateMonth);
        String issueDateDayString = setDateString(issueDateDay);

        issueDate = "Issue Date: " + year + "/" + issueDateMonthString + '/' + issueDateDayString;

    }

    public void setDocDate() {
        docDate = year + "년 " + setDateString(month) + "월 " + setDateString(day) + "일 ~ "
                + year + "년 " + setDateString(month) + "월 " + setDateString(day + 4) + "일";
    }

    public void setDocNameDate() {
        docNameDate = "주간보고_인프라운영사업본부_" + year + setDateString(month) + setDateString(day + 1) + "_김민경 연구원.docx";
    }

    public void setMentForSend() {
        mentForSend = "안녕하세요\n" +
                "지성아이티 김민경 연구원입니다.\n\n"
                + setDateString(month) + setDateString(day) + '~' + setDateString(month) + setDateString(day+4)
                + "까지의 주간보고입니다.\n"
                + "첨부파일 확인 부탁드립니다.";
    }

    private String setDateString(int date) {
        String dateString;
        if (date < 10) {
            dateString = "0" + date;
        } else {
            dateString = String.valueOf(date);
        }
        return dateString;
    }

    @Override
    public String toString() {
        return
                issueDate + "\n\n" +
                        docDate + "\n\n" +
                        docNameDate + "\n\n" +
                        mentForSend ;
    }


}
