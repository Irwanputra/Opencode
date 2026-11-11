.class public Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ$づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;",
        ">",
        "Ljava/lang/Object;",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u3073\u3048\u3041\u305c\u3044/\u3033\u305c\u305e\u305c\u3079\u3063$\u3065\u3056\u304b\u3079\u3079;"
    }
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306e\u3077\u306e\u3061\u3064/\u3044\u3044\u306b\u307d\u3064<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306e\u3077\u306e\u3061\u3064/\u3044\u3044\u306b\u307d\u3064<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;

    if-eqz v0, :cond_12

    check-cast p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;

    iget-object p1, p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    const/4 p1, 0x1

    goto :goto_13

    :cond_12
    const/4 p1, 0x0

    :goto_13
    return p1
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public 〺つふすそ()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    check-cast v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 3
    iget-object v0, v0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 4
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v2

    if-nez v2, :cond_18

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getScaleY()F

    move-result v1

    goto :goto_19

    :cond_18
    const/4 v1, 0x0

    :goto_19
    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ざっざへづ(F)V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 6

    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/いいにぽつ;

    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$くし〴〺ぅ;->〺つふすそ:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    check-cast v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getTranslationX()F

    move-result v2

    iget-object v3, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/BottomAppBar;->びえぁぜい(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v3

    .line 3
    iget v3, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->なぎぱいぢぎ:F

    cmpl-float v3, v3, v2

    if-eqz v3, :cond_28

    .line 4
    iget-object v3, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/BottomAppBar;->びえぁぜい(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v3

    .line 5
    iput v2, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->なぎぱいぢぎ:F

    .line 6
    iget-object v2, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 7
    iget-object v2, v2, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 8
    invoke-virtual {v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    :cond_28
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getTranslationY()F

    move-result v2

    neg-float v2, v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-object v4, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/BottomAppBar;->びえぁぜい(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v4

    .line 9
    iget v4, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->づざかべべ:F

    cmpl-float v4, v4, v2

    if-eqz v4, :cond_4e

    .line 10
    iget-object v4, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/BottomAppBar;->びえぁぜい(Lcom/google/android/material/bottomappbar/BottomAppBar;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;

    move-result-object v4

    invoke-virtual {v4, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉざぅち〻/づざかべべ;->くし〴〺ぅ(F)V

    iget-object v2, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 11
    iget-object v2, v2, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 12
    invoke-virtual {v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    :cond_4e
    iget-object v0, v0, Lcom/google/android/material/bottomappbar/BottomAppBar$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 13
    iget-object v0, v0, Lcom/google/android/material/bottomappbar/BottomAppBar;->ち〴みぎ〻び:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 14
    invoke-virtual {v1}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v2

    if-nez v2, :cond_5c

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getScaleY()F

    move-result v3

    :cond_5c
    invoke-virtual {v0, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ざっざへづ(F)V

    return-void
.end method
