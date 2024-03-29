package egovframework.com.cop.adb.service;


/**
 * 주소록구성원 관리를 위한 VO 모델 클래스
 * @author 공통컴포넌트개발팀 윤성록
 * @since 2009.09.25
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.9.25  윤성록          최초 생성
 *   2016.12.13 최두영          클래스명 변경
 * </pre>
 */
@SuppressWarnings("serial")
public class AddressBookUserVO extends AddressBookUser{
    
    
    /** 사용자 아이디 */
    private String userId = "";
    
    /** 사용자 명 */
    private String userNm = "";     

    /** 사용자 이메일 */
    private String userEmail = "";
    
    /** 사용자 접전화 처음 */
    private String areaNo = "";
    
    /** 사용자 집전화 가운데 */
    private String homemiddleTelno = "";
    
    /** 사용자 집전화 마지막 */
    private String homeendTelno = "";
       
    /** 검색시작일 */
    private String searchBgnDe = "";

    /** 검색조건 */
    private String searchCnd = "";

    /** 검색종료일 */
    private String searchEndDe = "";

    /** 검색단어 */
    private String searchWrd = "";

    /** 정렬순서(DESC,ASC) */
    private long sortOrdr = 0L;

    /** 검색사용여부 */
    private String searchUseYn = "";

    /** 현재페이지 */
    private int pageIndex = 1;

    /** 페이지개수 */
    private int pageUnit = 10;

    /** 페이지사이즈 */
    private int pageSize = 10;

    /** 첫페이지 인덱스 */
    private int firstIndex = 1;
    
    /** 마지막페이지 인덱스 */
    private int lastIndex = 1;

    /** 페이지당 레코드 개수 */
    private int recordCountPerPage = 10;

    /** 레코드 번호 */
    private int rowNo = 0;

    /** 최초 등록자명 */
    private String frstRegisterNm = "";

    /** 최종 수정자명 */
    private String lastUpdusrNm = "";
    
       
    /**
     * userId attribute를 리턴한다.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * userId attribute 값을 설정한다.
     * 
     * @param userId
     *            the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * userNm attribute를 리턴한다.
     * 
     * @return the userNm
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * userNm attribute 값을 설정한다.
     * 
     * @param userNm
     *            the userNm to set
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * userEmail attribute를 리턴한다.
     * 
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * userEmail attribute 값을 설정한다.
     * 
     * @param userEmail
     *            the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * userEmail attribute를 리턴한다.
     * 
     * @return the userEmail
     */
    public String getAreaNo() {
        return areaNo;
    }

    /**
     * userEmail attribute 값을 설정한다.
     * 
     * @param userEmail
     *            the userEmail to set
     */
    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    /**
     * userEmail attribute를 리턴한다.
     * 
     * @return the userEmail
     */
    public String getHomemiddleTelno() {
        return homemiddleTelno;
    }

    /**
     * userEmail attribute 값을 설정한다.
     * 
     * @param userEmail
     *            the userEmail to set
     */
    public void setHomemiddleTelno(String homemiddleTelno) {
        this.homemiddleTelno = homemiddleTelno;
    }

    /**
     * userEmail attribute를 리턴한다.
     * 
     * @return the userEmail
     */
    public String getHomeendTelno() {
        return homeendTelno;
    }

    public void setHomeendTelno(String homeendTelno) {
        this.homeendTelno = homeendTelno;
    }

    /**
     * searchBgnDe attribute를 리턴한다.
     * 
     * @return the searchBgnDe
     */
    public String getSearchBgnDe() {
        return searchBgnDe;
    }

    /**
     * searchBgnDe attribute 값을 설정한다.
     * 
     * @param searchBgnDe
     *            the searchBgnDe to set
     */
    public void setSearchBgnDe(String searchBgnDe) {
        this.searchBgnDe = searchBgnDe;
    }

    /**
     * searchCnd attribute를 리턴한다.
     * 
     * @return the searchCnd
     */
    public String getSearchCnd() {
        return searchCnd;
    }

    /**
     * searchCnd attribute 값을 설정한다.
     * 
     * @param searchCnd
     *            the searchCnd to set
     */
    public void setSearchCnd(String searchCnd) {
        this.searchCnd = searchCnd;
    }

    /**
     * searchEndDe attribute를 리턴한다.
     * 
     * @return the searchEndDe
     */
    public String getSearchEndDe() {
        return searchEndDe;
    }

    /**
     * searchEndDe attribute 값을 설정한다.
     * 
     * @param searchEndDe
     *            the searchEndDe to set
     */
    public void setSearchEndDe(String searchEndDe) {
        this.searchEndDe = searchEndDe;
    }

    /**
     * searchWrd attribute를 리턴한다.
     * 
     * @return the searchWrd
     */
    public String getSearchWrd() {
        return searchWrd;
    }

    /**
     * searchWrd attribute 값을 설정한다.
     * 
     * @param searchWrd
     *            the searchWrd to set
     */
    public void setSearchWrd(String searchWrd) {
        this.searchWrd = searchWrd;
    }

    /**
     * sortOrdr attribute를 리턴한다.
     * 
     * @return the sortOrdr
     */
    public long getSortOrdr() {
        return sortOrdr;
    }

    /**
     * sortOrdr attribute 값을 설정한다.
     * 
     * @param sortOrdr
     *            the sortOrdr to set
     */
    public void setSortOrdr(long sortOrdr) {
        this.sortOrdr = sortOrdr;
    }

    /**
     * searchUseYn attribute를 리턴한다.
     * 
     * @return the searchUseYn
     */
    public String getSearchUseYn() {
        return searchUseYn;
    }

    /**
     * searchUseYn attribute 값을 설정한다.
     * 
     * @param searchUseYn
     *            the searchUseYn to set
     */
    public void setSearchUseYn(String searchUseYn) {
        this.searchUseYn = searchUseYn;
    }

    /**
     * pageIndex attribute를 리턴한다.
     * 
     * @return the pageIndex
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * pageIndex attribute 값을 설정한다.
     * 
     * @param pageIndex
     *            the pageIndex to set
     */
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * pageUnit attribute를 리턴한다.
     * 
     * @return the pageUnit
     */
    public int getPageUnit() {
        return pageUnit;
    }

    /**
     * pageUnit attribute 값을 설정한다.
     * 
     * @param pageUnit
     *            the pageUnit to set
     */
    public void setPageUnit(int pageUnit) {
        this.pageUnit = pageUnit;
    }

    /**
     * pageSize attribute를 리턴한다.
     * 
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * pageSize attribute 값을 설정한다.
     * 
     * @param pageSize
     *            the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * firstIndex attribute를 리턴한다.
     * 
     * @return the firstIndex
     */
    public int getFirstIndex() {
        return firstIndex;
    }

    /**
     * firstIndex attribute 값을 설정한다.
     * 
     * @param firstIndex
     *            the firstIndex to set
     */
    public void setFirstIndex(int firstIndex) {
        this.firstIndex = firstIndex;
    }
    
    /**
     * lastIndex attribute를 리턴한다.
     * 
     * @return the lastIndex
     */
    public int getLastIndex() {
        return lastIndex;
    }

    /**
     * lastIndex attribute 값을 설정한다.
     * 
     * @param lastIndex
     *            the lastIndex to set
     */
    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    /**
     * recordCountPerPage attribute를 리턴한다.
     * 
     * @return the recordCountPerPage
     */
    public int getRecordCountPerPage() {
        return recordCountPerPage;
    }

    /**
     * recordCountPerPage attribute 값을 설정한다.
     * 
     * @param recordCountPerPage
     *            the recordCountPerPage to set
     */
    public void setRecordCountPerPage(int recordCountPerPage) {
        this.recordCountPerPage = recordCountPerPage;
    }

    /**
     * getRowNo attribute를 리턴한다.
     * 
     * @return the getRowNo
     */
    public int getRowNo() {
        return rowNo;
    }

    /**
     * getRowNo attribute 값을 설정한다.
     * 
     * @param getRowNo
     *            the getRowNo to set
     */
    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    /**
     * frstRegisterNm attribute를 리턴한다.
     * 
     * @return the frstRegisterNm
     */
    public String getFrstRegisterNm() {
        return frstRegisterNm;
    }

    /**
     * frstRegisterNm attribute 값을 설정한다.
     * 
     * @param frstRegisterNm
     *            the frstRegisterNm to set
     */
    public void setFrstRegisterNm(String frstRegisterNm) {
        this.frstRegisterNm = frstRegisterNm;
    }

    /**
     * lastUpdusrNm attribute를 리턴한다.
     * 
     * @return the lastUpdusrNm
     */
    public String getLastUpdusrNm() {
        return lastUpdusrNm;
    }

    /**
     * lastUpdusrNm attribute 값을 설정한다.
     * 
     * @param lastUpdusrNm
     *            the lastUpdusrNm to set
     */
    public void setLastUpdusrNm(String lastUpdusrNm) {
        this.lastUpdusrNm = lastUpdusrNm;
    }    
}
