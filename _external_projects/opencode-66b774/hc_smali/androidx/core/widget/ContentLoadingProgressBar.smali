.class public Landroidx/core/widget/ContentLoadingProgressBar;
.super Landroid/widget/ProgressBar;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/lang/Runnable;

.field public final くし〴〺ぅ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/core/widget/ContentLoadingProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroidx/core/widget/ContentLoadingProgressBar$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Landroidx/core/widget/ContentLoadingProgressBar$げつ〴ぬぐ;-><init>(Landroidx/core/widget/ContentLoadingProgressBar;)V

    iput-object p1, p0, Landroidx/core/widget/ContentLoadingProgressBar;->〺つふすそ:Ljava/lang/Runnable;

    new-instance p1, Landroidx/core/widget/ContentLoadingProgressBar$〺つふすそ;

    invoke-direct {p1, p0}, Landroidx/core/widget/ContentLoadingProgressBar$〺つふすそ;-><init>(Landroidx/core/widget/ContentLoadingProgressBar;)V

    iput-object p1, p0, Landroidx/core/widget/ContentLoadingProgressBar;->くし〴〺ぅ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 1
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->くし〴〺ぅ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V

    .line 1
    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/core/widget/ContentLoadingProgressBar;->くし〴〺ぅ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method
