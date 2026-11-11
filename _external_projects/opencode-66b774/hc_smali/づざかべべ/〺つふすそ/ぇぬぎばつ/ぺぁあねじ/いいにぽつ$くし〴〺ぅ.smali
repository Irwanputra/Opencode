.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$くし〴〺ぅ;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/CollapsibleActionView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    move-object v0, p1

    check-cast v0, Landroid/view/CollapsibleActionView;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$くし〴〺ぅ;->〺つふすそ:Landroid/view/CollapsibleActionView;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$くし〴〺ぅ;->〺つふすそ:Landroid/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/view/CollapsibleActionView;->onActionViewExpanded()V

    return-void
.end method

.method public づざかべべ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$くし〴〺ぅ;->〺つふすそ:Landroid/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/view/CollapsibleActionView;->onActionViewCollapsed()V

    return-void
.end method
