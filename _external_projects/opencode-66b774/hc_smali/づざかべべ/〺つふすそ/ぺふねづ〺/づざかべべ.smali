.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroid/view/View;

.field public final synthetic びぐびあび:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    .registers 4

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;->〺つふすそ:Landroid/view/View;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;->くし〴〺ぅ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->びえぁぜい:Landroidx/core/widget/NestedScrollView;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;->〺つふすそ:Landroid/view/View;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/づざかべべ;->くし〴〺ぅ:Landroid/view/View;

    invoke-static {v0, v1, v2}, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
