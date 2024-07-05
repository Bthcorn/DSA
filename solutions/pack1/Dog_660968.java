package solutions.pack1;

public class Dog_660968 {
  public Breed breed;
  private int weight;

  Dog_660968() {
    this.weight = 0;
  }

  public Dog_660968(Breed breed, int weight) {
    this.weight = weight;
    this.breed = breed;
    // System.out.print("" + breed + " " + weight + " ");
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Dog [breed=" + breed + ", weight=" + weight + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((breed == null) ? 0 : breed.hashCode());
    result = prime * result + weight;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dog_660968 other = (Dog_660968) obj;
    if (breed != other.breed)
      return false;
    if (weight != other.weight)
      return false;
    return true;
  }
}
