class Subject
{
    private String subId;
    private String subName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String sbId,String sbNm)
    {
        this.subName=sbNm;
        this.subId=sbId;
    }
    public Subject(String sbId, String sbNM, int mxMks, int mxObt)
    {
        this.subId=sbId;
        this.subName=sbNM;
        setMaxMarks(mxMks);
        setMarksObtained(mxObt);
    }
    public void setMaxMarks(int mxMks) {maxMarks=mxMks;}
    public void setMarksObtained(int mxObt) {marksObtained=mxObt;}
    public int getMaxMarks() {return maxMarks;}
    public int getMarksObtained() {return marksObtained;}
    public String getSubId() {return subId;}
    public String getSubName() {return subName;}
    public String toString()
    {
        return "Subject Id : "+subId+"\nSubject Name : "+subName+"\nMaximum Marks : "+maxMarks+"\nMarks Obtained : "+marksObtained+"\n---END---";
    }


}