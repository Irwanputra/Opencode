.class public Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/ScrimInsetsFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/ScrimInsetsFrameLayout;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 7

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    iget-object v0, p1, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->くし〴〺ぅ:Landroid/graphics/Rect;

    if-nez v0, :cond_d

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p1, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->くし〴〺ぅ:Landroid/graphics/Rect;

    :cond_d
    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    iget-object p1, p1, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->くし〴〺ぅ:Landroid/graphics/Rect;

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v0

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v1

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v2

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-virtual {p1, p2}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->げつ〴ぬぐ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    .line 1
    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->なぎぱいぢぎ()Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_41

    .line 2
    iget-object v0, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    iget-object v0, v0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_40

    goto :goto_41

    :cond_40
    const/4 v1, 0x0

    :cond_41
    :goto_41
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->どぇぞほだ(Landroid/view/View;)V

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p1

    return-object p1
.end method
