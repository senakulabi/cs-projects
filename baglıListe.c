#include <stdio.h>
#include <stdlib.h>

// Düğüm (Node) yapısı
struct Dugum {
    int veri;
    struct Dugum* sonraki;
};

// Listeye eleman ekleme fonksiyonu (başa ekleme)
void elemanEkle(struct Dugum** bas_ref, int yeni_veri) {
    // Yeni düğüm için bellekte yer ayır
    struct Dugum* yeni_dugum = (struct Dugum*)malloc(sizeof(struct Dugum));
    
    yeni_dugum->veri = yeni_veri;
    yeni_dugum->sonraki = (*bas_ref);
    (*bas_ref) = yeni_dugum;
    
    printf("%d degeri listeye eklendi.\n", yeni_veri);
}

// Listeyi ekrana yazdırma fonksiyonu
void listeyiYazdir(struct Dugum* n) {
    printf("\n--- Bagli Liste Elemanlari ---\n");
    while (n != NULL) {
        printf("%d -> ", n->veri);
        n = n->sonraki;
    }
    printf("NULL\n");
}

int main() {
    // Başlangıçta liste boş (NULL)
    struct Dugum* bas = NULL;

    // Listeye elemanlar ekleyelim
    elemanEkle(&bas, 10);
    elemanEkle(&bas, 20);
    elemanEkle(&bas, 30);

    // Listeyi ekrana yazdıralım
    listeyiYazdir(bas);

    return 0;
}
