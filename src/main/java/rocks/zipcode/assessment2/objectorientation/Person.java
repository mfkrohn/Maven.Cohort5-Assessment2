package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        if(id!=null){this.id =id;}
        else{this.id = Long.MIN_VALUE;}
        this.name = name;
        if(address!=null){this.address = address;}
        else{this.address = new Address();}
    }

    public Person(String name){
        this(Long.MIN_VALUE,name,new Address());
    }

    public Person() {
        this(Long.MIN_VALUE,"",new Address());
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person{id="+ id +", name='" + name + "', address=" + address.toString()+"}";
    }

    @Override
    public boolean equals(Object o) {

        return this.toString().equals(o.toString());
    }
}