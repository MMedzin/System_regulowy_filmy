# System_regulowy_filmy
## JavaFX w Eclipse
### Do działania programu potrzebne jest wsparcie dla javaFX, w Eclipse zapewnia je wtyczka e(fx)clipse
### Instalacja wtyczki:
1. Uruchamiamy Eclipse i wybieramy kolejno 'Help' > 'Eclipse Marketplace'.
2. W pole wyszukiwania wpisujemy e(fx)clipse i zatwierdzamy.
3. Wybieramy wtyczkę e(fx)clipse i instalujemy ją.
4. Po zakończeniu instalacji należy ponownie uruchomić Eclipse.

### Dodatkowo należy dodać odpowiednie argumenty dla maszyny wirtualnej Javy:
1. Rozwijamy folder projektu w eclipse i klikamy PPM na klasę src/main/Java/com.sample/Main.java.
2. Z menu kontekstowego wybieramy 'Run As' > 'Run Configurations...'.
3. Z listy wybieramy 'Java Application', a następnie klikamy 'New launch configuration'.
4. W zakładce 'Arguments' w polu 'VM arguments' umieszczamy odpowiednio dla systemów Linux: '--module-path src/main/lib/linux/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml' oraz dla systemów Windows: '--module-path src\main\lib\windows\javafx-sdk-11.0.2\lib --add-modules=javafx.controls,javafx.fxml'
5. Klikamy 'Apply'.
