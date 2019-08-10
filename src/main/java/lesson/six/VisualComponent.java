package lesson.six;
/*1) Добавить в иерархию классов Component новый интерфейс VisualComponent
	унаследовать класс Component от VisualComponent
	(Component implements VisualComponent)

	Интерфейс VisualComponent должен иметь один метод:
		- void draw();

		-продемонстрировать работу метода draw() у всех компонентов

2) Добавить новый метод по умолчанию в VisualComponent
		- default void draw3D(); //

	унаследовать класс Component от VisualComponent
		- перекрыть метод draw3D у Label
		- продемонстрировать работу метода draw3D() во всех компонентах */

public interface VisualComponent {
    void draw();

    default void draw3D() {
        System.out.println("Component 3D");
    }
}
