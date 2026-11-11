.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u304a\u3050\u3074\u3046\u3038\u305a$\u303a\u3064\u3075\u3059\u305d<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/Class;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;-><init>(ILjava/lang/Class;I)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isAccessibilityHeading()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public づざかべべ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 3

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    .line 1
    invoke-virtual {p0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->げつ〴ぬぐ(Ljava/lang/Boolean;Ljava/lang/Boolean;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public びぐびあび(Landroid/view/View;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Ljava/lang/Boolean;

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setAccessibilityHeading(Z)V

    return-void
.end method
