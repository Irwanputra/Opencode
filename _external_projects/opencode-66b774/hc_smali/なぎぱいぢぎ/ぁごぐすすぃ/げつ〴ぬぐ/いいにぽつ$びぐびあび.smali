.class public final Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/いいにぽつ$びぐびあび;
.super Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/げつ〴ぬぐ;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;F)V
    .registers 4

    check-cast p1, Landroid/view/View;

    .line 1
    invoke-static {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/View;)Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;

    move-result-object p1

    .line 2
    iget-object v0, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p2, v0

    .line 3
    iget v0, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->のぷのちつ:F

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_24

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ()V

    iput p2, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->のぷのちつ:F

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ()V

    :cond_24
    return-void
.end method

.method public げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroid/view/View;

    .line 1
    invoke-static {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/View;)Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;

    move-result-object p1

    .line 2
    iget-object v0, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_12

    const/4 p1, 0x0

    goto :goto_1a

    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget p1, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->のぷのちつ:F

    add-float/2addr p1, v0

    .line 3
    :goto_1a
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
