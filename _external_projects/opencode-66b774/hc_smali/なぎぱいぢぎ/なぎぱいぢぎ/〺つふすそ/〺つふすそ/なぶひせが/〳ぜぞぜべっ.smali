.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

.field public くし〴〺ぅ:F

.field public final げつ〴ぬぐ:Landroid/text/TextPaint;

.field public づざかべべ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306a\u3076\u3072\u305b\u304c/\u3033\u305c\u305e\u305c\u3079\u3063$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

    iput-boolean v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->びぐびあび:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/ref/WeakReference;

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;Landroid/content/Context;)V
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    if-eq v0, p1, :cond_4c

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    if-eqz p1, :cond_38

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

    .line 1
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->げつ〴ぬぐ()V

    iget-object v2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->てぜきぽく:Landroid/graphics/Typeface;

    .line 2
    invoke-virtual {p1, v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->びぐびあび(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/くし〴〺ぅ;

    invoke-direct {v2, p1, v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/くし〴〺ぅ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;Landroid/text/TextPaint;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;)V

    invoke-virtual {p1, p2, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->〺つふすそ(Landroid/content/Context;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;)V

    .line 3
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;

    if-eqz v0, :cond_2e

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    invoke-interface {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;->getState()[I

    move-result-object v0

    iput-object v0, v1, Landroid/text/TextPaint;->drawableState:[I

    :cond_2e
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

    invoke-virtual {p1, p2, v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->くし〴〺ぅ(Landroid/content/Context;Landroid/text/TextPaint;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->びぐびあび:Z

    :cond_38
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;

    if-eqz p1, :cond_4c

    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ()V

    invoke-interface {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;->getState()[I

    move-result-object p2

    invoke-interface {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;->onStateChange([I)Z

    :cond_4c
    return-void
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;)F
    .registers 5

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->びぐびあび:Z

    if-nez v0, :cond_7

    iget p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->くし〴〺ぅ:F

    return p1

    :cond_7
    const/4 v0, 0x0

    if-nez p1, :cond_c

    const/4 p1, 0x0

    goto :goto_16

    .line 1
    :cond_c
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, p1, v0, v2}, Landroid/text/TextPaint;->measureText(Ljava/lang/CharSequence;II)F

    move-result p1

    .line 2
    :goto_16
    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->くし〴〺ぅ:F

    iput-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->びぐびあび:Z

    return p1
.end method
