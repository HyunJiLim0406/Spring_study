package hello.core.singleton;

public class SingletonService { //유연성이 떨어짐

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){ //외부에서 new 키워드로 객체 인스턴스 생성하지 못하도록 생성자를 private으로 함
    }

    public void logic(){
        System.out.println("Call singleton instance logic");
    }
}
