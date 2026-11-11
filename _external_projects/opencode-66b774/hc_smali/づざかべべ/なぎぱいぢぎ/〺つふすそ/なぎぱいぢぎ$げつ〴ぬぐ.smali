.class public Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->のぷのちつ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3041\u3054\u3050\u3059\u3059\u3043;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    check-cast p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    .line 1
    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:I

    iget p2, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:I

    sub-int/2addr p1, p2

    return p1
.end method
