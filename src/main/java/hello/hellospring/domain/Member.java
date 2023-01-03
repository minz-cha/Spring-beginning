package hello.hellospring.domain;

public class Member {

    private Long id; //시스템 내부에서 정하는 특정 id값 (for 데이터 구분)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
