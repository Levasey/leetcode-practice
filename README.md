# leetcode-practice

Локальные решения задач LeetCode на Java с проверкой через JUnit.

## Структура

- `src/main/java/practice/leetcode/common/` — общие типы (`ListNode`, `TreeNode`).
- `src/main/java/practice/leetcode/problems/pNNNNslug/` — одна папка на задачу: класс решения + ссылка на LeetCode в Javadoc.

## Как добавить задачу

1. Создай пакет `problems/pXXXXshortname` (номер и короткое имя из URL).
2. Класс с методом(ами) решения.
3. В `src/test/java/...` — тесты по примерам с сайта.

## Сборка и тесты

```bash
cd leetcode-practice
mvn test
```

Запуск тестов одного класса:

```bash
mvn -Dtest=TwoSumTest test
```

## IntelliJ

File → Open → выбери папку `leetcode-practice` (Maven подхватит `pom.xml`).
