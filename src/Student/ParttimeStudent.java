package Student;

 class ParttimeStudent implements Student {
    private int hours;

    public ParttimeStudent(String name, int id) {
        this(name, id, 0);  // Constructor chaining
    }

    public ParttimeStudent(String name, int id, int hours) {
        super();
        this.hours = hours;
    }

    // Getter and Setter for hours
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

	@Override
	public void setID(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGPA(Double gpa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getGPA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
