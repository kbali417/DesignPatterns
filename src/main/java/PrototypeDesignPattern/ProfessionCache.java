package PrototypeDesignPattern;

import java.util.Hashtable;

public class ProfessionCache {
  public static Hashtable<Integer, Profession> professionMap = new Hashtable<Integer, Profession>();

  public static Profession getCloneNewProfession(int id) {
    Profession cachedProfessionInstanceId = professionMap.get(id);
    return (Profession) cachedProfessionInstanceId.cloningMethod();
  }

  public static void loadProfessionCache() {
    Doctor doc = new Doctor();
    doc.id = 1;
    professionMap.put(doc.id, doc);

    Engineer eng = new Engineer();
    eng.id = 2;
    professionMap.put(eng.id, eng);

    Teacher tea = new Teacher();
    tea.id = 3;
    professionMap.put(tea.id, tea);
  }
}
