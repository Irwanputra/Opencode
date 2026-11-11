.class public abstract Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/〺つふすそ;
.super Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043/\u303a\u3064\u3075\u3059\u305d/\u304f\u3057\u3034\u303a\u3045<",
        "TT;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    const-class v0, Ljava/lang/Integer;

    invoke-direct {p0, v0, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/くし〴〺ぅ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Ljava/lang/Integer;

    .line 1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;Ljava/lang/Integer;)V

    return-void
.end method

.method public final くし〴〺ぅ(Ljava/lang/Object;Ljava/lang/Integer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;Ljava/lang/Integer;)V

    return-void
.end method
