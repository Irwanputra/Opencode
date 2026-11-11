.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;
.super Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Ljava/lang/ref/WeakReference;

.field public final synthetic げつ〴ぬぐ:I

.field public final synthetic びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;IILjava/lang/ref/WeakReference;)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:I

    iput p3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->〺つふすそ:I

    iput-object p4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;-><init>()V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(I)V
    .registers 2

    return-void
.end method

.method public びぐびあび(Landroid/graphics/Typeface;)V
    .registers 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_18

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->げつ〴ぬぐ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_18

    iget v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->〺つふすそ:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_13

    const/4 v1, 0x1

    goto :goto_14

    :cond_13
    const/4 v1, 0x0

    :goto_14
    invoke-static {p1, v0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_18
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/ref/WeakReference;

    .line 1
    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->のぷのちつ:Z

    if-eqz v2, :cond_2f

    iput-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->てぜきぽく:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_2f

    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ:I

    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_2f
    return-void
.end method
