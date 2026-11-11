.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ぺふねづ〺;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d;"
    }
.end annotation


# direct methods
.method public static へえどぜせ(Landroid/content/Context;)Z
    .registers 5

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->materialCalendarStyle:I

    const-class v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->しぷげへが(Landroid/content/Context;ILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    const v2, 0x101020d

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-virtual {p0, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return v0
.end method
