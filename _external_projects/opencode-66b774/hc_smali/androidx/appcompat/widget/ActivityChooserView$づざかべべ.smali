.class public Landroidx/appcompat/widget/ActivityChooserView$づざかべべ;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$づざかべべ;->げつ〴ぬぐ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .registers 2

    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$づざかべべ;->げつ〴ぬぐ:Landroidx/appcompat/widget/ActivityChooserView;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0
.end method
