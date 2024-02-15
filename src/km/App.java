package km;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;

public class App {
    public static void main(String[] args) {
        /*
            JPMS, czyli Java Platform Module System, jest systemem modułów
            wprowadzonym w Javie 9. Jego głównym celem jest dostarczenie
            lepszego sposobu na strukturyzację i organizację kodu Javy,
            zarówno dla aplikacji, jak i dla samej platformy Javy.
            JPMS wprowadza koncepcję modułów jako standardowego sposobu
            enkapsulacji kodu i jego zależności, zastępując wcześniej używane
            luźno zorganizowane pakiety JAR.

            => Lepsza enkapsulacja kodu
            JPMS pozwala definiować moduły, które jasno określają, które części
            są dostępne dla innych modułów, a które części są ukryte i używane
            tylko wewnętrznie. Dzięki temu moduły mogą ukrywać swoją wewnętrzną
            implementację przed zewnętrznymi użytkownikami, co zwiększa bezpieczeństwo
            i ułatwia utrzymanie kodu.

            W JDK 8 i wcześniejszych wersjach Java Development Kit (JDK) była dostarczana
            głównie jako zestaw dużych, monolitycznych plików JAR i innych bibliotek,
            które zawierały całą funkcjonalność platformy Java. Te pliki JAR były
            zorganizowane w oparciu o różne części platformy, ale nie były podzielone na
            mniejsze, bardziej zarządzalne moduły.

            Problemy związane z konfliktami wersji bibliotek, trudnościami w zarządzaniu
            zależnościami i problemami z izolacją.
            JAR Hell

            rt.jar
            tools.jar
            jfxrt.jar
            charsets.jar
            jce.jar
            Poza wymienionymi, były również inne pliki JAR i biblioteki specyficzne dla
            platformy (np. dla GUI), takie jak swing, awt, oraz inne komponenty specyficzne
            dla danej funkcjonalności Javy.

            => Modularizacja platformy Java
            JPMS pozwolił na podział Javy na mniejsze moduły, co umożliwia tworzenie
            lżejszych aplikacji, które wymagają tylko części platformy Java. To z kolei
            przyczynia się do lepszej wydajności i mniejszego zużycia zasobów.

        */

        /*
            W kontekście Java Platform Module System (JPMS), wszystkie klasy, które nie są częścią
            jawnie zdefiniowanego modułu (tzn. nie są zawarte w module zdefiniowanym przez plik module-info.java),
            są automatycznie przypisane do tzw. "unnamed module" (modułu bez nazwy). Każdy ClassLoader w Javie
            ma swój własny "unnamed module".

            "Unnamed module" ma dostęp do wszystkich innych modułów, w tym tych zdefiniowanych w module-info.java,
            ponieważ domyślnie eksportuje wszystkie swoje pakiety i może czytać wszystkie inne moduły.

            W przeciwieństwie do modułów zdefiniowanych, "unnamed module" nie zapewnia silnej enkapsulacji ani
            izolacji pomiędzy pakietami, co oznacza, że klasy w "unnamed module" mogą swobodnie korzystać z klas
            w innych modułach (o ile te moduły je eksportują).

            "Unnamed module" ułatwia migrację istniejących aplikacji i bibliotek do JPMS, pozwalając w kodzie
            niewykorzystującemu jeszcze modułów działać bez konieczności natychmiastowej reorganizacji w moduły.
            To zapewnia kompatybilność wsteczną dla aplikacji i bibliotek napisanych dla wersji Javy przed 9, które
            nie są świadome systemu modułowego i nie są podzielone na moduły za pomocą plików module-info.java.
        */

        BufferedImage bufferedImage = new BufferedImage(1, 1, 1);
        BufferedReader bufferedReader;

    }
}
