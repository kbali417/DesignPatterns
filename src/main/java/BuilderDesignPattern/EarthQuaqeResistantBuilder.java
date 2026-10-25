package BuilderDesignPattern;

public class EarthQuaqeResistantBuilder implements Builder {
  private Home earthQuakeResistantHome = new Home();

  @Override
  public void buildFloor() {
    this.earthQuakeResistantHome.floor = "Wooden resistance floor";
  }

  @Override
  public void buildWalls() {
    this.earthQuakeResistantHome.walls = "Wooden walls";
  }

  @Override
  public void buildRoof() {
    this.earthQuakeResistantHome.terrace = "Wodden terrace";
  }

  @Override
  public Home getComplexHomeObject() {
    return this.earthQuakeResistantHome;
  }
}
