class ProjectClass {
    public String name;
    public String description;
    public double initialCost; 

    public ProjectClass() {
        System.out.println("A Project");
    }

    public ProjectClass(String name) {
        this.name = name;
    }

    public ProjectClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProjectClass(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return name + ", $" + initialCost + " : " + description;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String nameInput) {
        name = nameInput;
    }

    // getter
    public String getDesc() {
        return description;
    }

    // setter
    public void setDesc(String descInput) {
        description = descInput;
    }

    // getter
    public double getInitialCost() {
        return initialCost;
    }

    // setter
    public void setInitialCost(double initialCostInput) {
        initialCost = initialCostInput;
    }
}