package BuilderDesignPattern;

interface Builder {
  public void buildFloor();

  public void buildWalls();

  public void buildRoof();

  public Home getComplexHomeObject();
}
