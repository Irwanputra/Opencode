.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/でどあくず;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ざとぅぼこ〺(IJ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

.field public げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;I)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->〺つふすそ:I

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/でどあくず;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)V
    .registers 3

    iget-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-nez p1, :cond_d

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_d
    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    return-void
.end method
