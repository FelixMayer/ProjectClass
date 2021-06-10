class ProjectClassTest {
    public static void main(String[] args) {
        ProjectClass p = new ProjectClass();
        p.elevatorPitch();
        p.setName("Coding Adventure");
        p.setDesc("A hero fighting the evil sintax error");

        String pName = p.getName();
        String pDesc = p.getDesc();

        System.out.println("Project object - Name: " + pName + ", Description: " + pDesc);
        ProjectClass p1 = new ProjectClass("Finding Nemo", "A story with theories that Nemo never existed");
        System.out.println("Project object - Name: " + p1.getName() + ", Description: " + p1.getDesc());
        ProjectClass p2 = new ProjectClass("A story with no description");
        System.out.println("Project object - Name: " + p2.getName() + ", Description: " + p2.getDesc());
        ProjectClass p3 = new ProjectClass("Ninja's Adventure", "A very exciting adventure", 100.0);
        System.out.println(p3.elevatorPitch()); 
    }
}
