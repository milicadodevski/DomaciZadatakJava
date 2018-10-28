
package knjizara;


public interface UporedivoPoCenama {
    boolean skupljeOd(UporedivoPoCenama a); //apstraktne metoda, kasnija implementacija
    boolean jeftinijeOd(UporedivoPoCenama a);
}
