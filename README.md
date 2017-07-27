2) Dependency management omogucava da se u glavom POMu definisu verzije koriscenih depencencia u projektu, pa se u ostalim POMovima definise samo dependency bez verzije, gde maven onda automatski preko parent-child odnosa se penje kroz POMove dok ne nadje dependecy management, i odatle vuce verziju. To je korisno zato sto se prilikom promene verzije dependencija ne menja u svakom POMu verzija, vec samo u glavnom.

3)
@autowired - sluzi da ubrizga komponentu koja nam je potrebna automatski
@primary - ako ima vise komponenti koje mogu da se ubrizgaju, daje prednost ovoj
@service - oznacava da je komponenta servis.
@controller - oznacava da je komponenta kontroler, dozvoljava da se onda koristi @RequestMapping preko kog se definise API
@repository - oznacava da je komponenta repozitorijum za cuvanje/povlacenje podataka
@valid - proverava da li podaci podlezu ocekivanoj strukturi pre nego sto nesto se uradi sa njima
@ControllerAdvice - sluzi za definisanje izuzetaka koji ce da pokriju sve kontrolere u aplikaciji

Spring bean - bilo koji objekat kojim upravlja Spring Framework. Moze se kreirati preko konfiguracionog fajla ili automatski preko anotacija.

Application context inicijalizuje beanove, ucitava resurse, registruje kontrolere, sluzi za konfigurisanje aplikacije.

