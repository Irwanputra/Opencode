.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/じぜこほぱ;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/ぶでにく〼〳;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/Resources;)V
    .registers 3

    invoke-direct {p0, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぶでにく〼〳;-><init>(Landroid/content/res/Resources;)V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/じぜこほぱ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getDrawable(I)Landroid/graphics/drawable/Drawable;
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぶでにく〼〳;->げつ〴ぬぐ:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/じぜこほぱ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-eqz v0, :cond_19

    if-eqz v1, :cond_19

    invoke-static {}, Lづざかべべ/〺つふすそ/ぉざぅち〻/でどあくず;->びぐびあび()Lづざかべべ/〺つふすそ/ぉざぅち〻/でどあくず;

    move-result-object v2

    invoke-virtual {v2, v1, p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/でどあくず;->てぜきぽく(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    :cond_19
    return-object v0
.end method
