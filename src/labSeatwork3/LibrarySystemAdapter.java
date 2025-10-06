package labSeatwork3;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem library;

    public LibrarySystemAdapter(LibrarySystem library) {
        this.library = library;
    }

    @Override
    public String integrateSystem() {
        return library.manageBooks();
    }
}