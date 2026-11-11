.class public Landroidx/appcompat/widget/Toolbar$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 2

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/Toolbar;

    .line 1
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->〺でおいここ:Landroidx/appcompat/widget/Toolbar$びぐびあび;

    if-nez p1, :cond_8

    const/4 p1, 0x0

    goto :goto_a

    :cond_8
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    :goto_a
    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->collapseActionView()Z

    :cond_f
    return-void
.end method
