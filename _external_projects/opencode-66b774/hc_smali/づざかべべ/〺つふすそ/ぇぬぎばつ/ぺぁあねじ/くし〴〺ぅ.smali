.class public abstract Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3033\u305c\u305e\u305c\u3079\u3063/\u3052\u3064\u3034\u306c\u3050/\u304f\u3057\u3034\u303a\u3045;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final くし〴〺ぅ(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .registers 5

    instance-of v0, p1, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v0, :cond_29

    move-object v0, p1

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    if-nez v1, :cond_12

    new-instance v1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    :cond_12
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v1, p1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Landroid/view/MenuItem;

    if-nez p1, :cond_29

    new-instance p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-direct {p1, v1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;-><init>(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v1, v0, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    return-object p1
.end method

.method public final びぐびあび(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .registers 4

    instance-of v0, p1, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ;

    if-eqz v0, :cond_28

    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    if-nez v0, :cond_11

    new-instance v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    :cond_11
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_27

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/は〲ぱなで;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/は〲ぱなで;-><init>(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v1, p1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_27
    return-object v0

    :cond_28
    return-object p1
.end method
