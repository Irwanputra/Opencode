.class public Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->てぜきぽく(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;->〺つふすそ:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;->〺つふすそ:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    iget-object v1, v0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぷぞてのほき:Landroidx/appcompat/widget/AppCompatSpinner;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v0, v0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->ぉひのべい:Landroid/graphics/Rect;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_17

    const/4 v0, 0x1

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :goto_18
    if-nez v0, :cond_20

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;->〺つふすそ:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->dismiss()V

    goto :goto_2a

    :cond_20
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;->〺つふすそ:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;->は〲ぱなで()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび$〺つふすそ;->〺つふすそ:Landroidx/appcompat/widget/AppCompatSpinner$びぐびあび;

    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    :goto_2a
    return-void
.end method
