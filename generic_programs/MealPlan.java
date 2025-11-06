interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T p){ plan=p; }
}

class MealUtil {
    public static <T extends MealPlan> void generatePlan(T plan){
        System.out.println("Generated plan: " + plan.getClass().getSimpleName());
    }
}
